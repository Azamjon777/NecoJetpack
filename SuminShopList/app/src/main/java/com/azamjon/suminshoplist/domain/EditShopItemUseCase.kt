package com.azamjon.suminshoplist.domain

import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.domain.repository.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    suspend fun editShopItemUseCase(shopItem: ShopItem) {
        shopListRepository.editShopItemUseCase(shopItem = shopItem)
    }
}