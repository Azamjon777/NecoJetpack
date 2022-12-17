package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem = shopItem)
    }
}