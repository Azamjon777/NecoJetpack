package com.azamjon.suminshoplist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.ListAdapter
import com.azamjon.suminshoplist.R
import com.azamjon.suminshoplist.databinding.ItemShopDisabledBinding
import com.azamjon.suminshoplist.databinding.ItemShopEnabledBinding
import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.presentation.ShopItemDiffCallback

class ShopListAdapter :
    ListAdapter<ShopItem, ShopItemViewHolder>(ShopItemDiffCallback()) {
// ListAdapter для того чтобы дейтвия были в другом потоке, для оптимизации

/*
    var shopList = listOf<ShopItem>()
        set(newList) {
            val callback = ShopListDiffCallback(shopList, newList)
            val diffResult = DiffUtil.calculateDiff(callback)
            diffResult.dispatchUpdatesTo(this)
            // это все для того чтобы не создавать заного viewHolder-ы при удалении 1-го item
            // для оптимизации
            field = newList
        }
*/

    var onShopItemLongClickListener: ((ShopItem) -> Unit)? = null
    var onShopItemClickListener: ((ShopItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopItemViewHolder {
        val layout = when (viewType) {
            VIEW_TYPE_ENABLED -> {
                R.layout.item_shop_enabled
            }
            VIEW_TYPE_DISABLED -> {
                R.layout.item_shop_disabled
            }
            else -> throw RuntimeException("Unknown view type: $viewType")
        }
        val binding =
            DataBindingUtil.inflate<ViewDataBinding>(
                LayoutInflater.from(parent.context),
                layout,
                parent,
                false
            )
        return ShopItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShopItemViewHolder, position: Int) {
        val shopItem = getItem(position)
        val binding = holder.binding
        binding.root.setOnLongClickListener {
            onShopItemLongClickListener?.invoke(shopItem)
            // у лямбда выражений можно явно вызвать метод invoke()
            // invoke() используется изза того что у нас переменная нулабельная и ...
            // invoke() нужен для того чтобы вызвать функция находящуюся внутри переменной
            true
        }

        binding.root.setOnClickListener {
            onShopItemClickListener?.invoke(shopItem)
        }
        when (binding) {
            is ItemShopDisabledBinding -> {
                binding.shopItem = shopItem//здесь передаем shopItem в xml файл

            }
            is ItemShopEnabledBinding -> {
                binding.shopItem = shopItem
            }
        }
    }

    /*override fun onViewRecycled(holder: ShopItemViewHolder) {
        super.onViewRecycled(holder)
        holder.tvName.text = ""
        holder.tvCount.text = ""
    }
    этот метод для того чтобы переиспользовать viewHolder, а не создавать снова
    */

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item.enabled) {
            VIEW_TYPE_ENABLED
        } else {
            VIEW_TYPE_DISABLED
        }
    }

    companion object {
        const val VIEW_TYPE_ENABLED = 1
        const val VIEW_TYPE_DISABLED = 2

        const val MAX_POOL_SIZE = 15
    }
}