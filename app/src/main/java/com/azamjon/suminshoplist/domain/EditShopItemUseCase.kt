package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItemUseCase(shopItem: ShopItem) {
        shopListRepository.editShopItemUseCase(shopItem = shopItem)
    }
}