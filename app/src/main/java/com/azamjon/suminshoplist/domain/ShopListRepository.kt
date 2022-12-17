package com.azamjon.suminshoplist.domain

import androidx.lifecycle.LiveData
import com.azamjon.suminshoplist.domain.model.ShopItem

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun getShopItemById(shopItemId: Int): ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
    fun refactorShopItemUseCase(shopItem: ShopItem)
    fun removeShopItem(shopItem: ShopItem)
}