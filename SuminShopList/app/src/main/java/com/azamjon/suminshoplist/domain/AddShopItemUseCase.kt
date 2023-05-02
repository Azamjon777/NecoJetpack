package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem = shopItem)
    }
}