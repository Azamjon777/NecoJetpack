package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.domain.repository.ShopListRepository

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun removeShopItem(shopItem: ShopItem) {
        shopListRepository.removeShopItem(shopItem = shopItem)
    }
}