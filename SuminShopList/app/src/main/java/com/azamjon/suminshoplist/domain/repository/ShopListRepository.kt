package com.azamjon.suminshoplist.domain.repository

import androidx.lifecycle.LiveData
import com.azamjon.suminshoplist.domain.model.ShopItem

interface ShopListRepository {
    suspend fun addShopItem(shopItem: ShopItem)
    suspend fun getShopItemById(shopItemId: Int): ShopItem
    suspend fun editShopItemUseCase(shopItem: ShopItem)
    suspend fun removeShopItem(shopItem: ShopItem)
    fun getShopList(): LiveData<List<ShopItem>>
}