package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem

class RefactorShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun refactorShopItemUseCase(shopItem: ShopItem) {
        shopListRepository.refactorShopItemUseCase(shopItem = shopItem)
    }
}