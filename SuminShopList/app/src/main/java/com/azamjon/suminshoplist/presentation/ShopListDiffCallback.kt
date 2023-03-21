package com.azamjon.suminshoplist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopListDiffCallback(
    private val oldList: List<ShopItem>,
    private val newList: List<ShopItem>
    // кстати private val используется для того чтобы данные можно было использовать и внутри класса
    // это мой вывод всего лишь, позже могу дополнить
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldContent = oldList[oldItemPosition]
        val newContent = newList[newItemPosition]
        return oldContent == newContent
    }
}