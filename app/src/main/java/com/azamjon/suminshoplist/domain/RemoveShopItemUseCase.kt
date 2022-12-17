package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun removeShopItem(shopItem: ShopItem) {
        shopListRepository.removeShopItem(shopItem = shopItem)
    }
}