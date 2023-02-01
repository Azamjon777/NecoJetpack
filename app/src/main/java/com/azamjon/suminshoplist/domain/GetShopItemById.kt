package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.domain.repository.ShopListRepository

class GetShopItemById(private val shopListRepository: ShopListRepository) {
    suspend fun getShopItemById(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemById(shopItemId = shopItemId)
    }
}