package com.azamjon.suminshoplist.presentation

import androidx.lifecycle.ViewModel
import com.azamjon.suminshoplist.data.ShopListRepositoryImpl
import com.azamjon.suminshoplist.domain.GetShopListUseCase
import com.azamjon.suminshoplist.domain.RefactorShopItemUseCase
import com.azamjon.suminshoplist.domain.RemoveShopItemUseCase
import com.azamjon.suminshoplist.domain.model.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repository)
    private val refactorShopItemUseCase = RefactorShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun removeItem(shopItem: ShopItem) {
        removeShopItemUseCase.removeShopItem(shopItem = shopItem)
    }

    fun refactorShopItem(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        refactorShopItemUseCase.refactorShopItemUseCase(newItem)
    }
}