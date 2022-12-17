package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem

class GetShopItemById(private val shopListRepository: ShopListRepository) {
    fun getShopItemById(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemById(shopItemId = shopItemId)
    }
}