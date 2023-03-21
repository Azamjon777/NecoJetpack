package com.azamjon.suminshoplist.presentation

import androidx.recyclerview.widget.DiffUtil
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopItemDiffCallback :
    DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }
}