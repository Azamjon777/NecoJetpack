package com.azamjon.suminshoplist.presentation

import androidx.lifecycle.ViewModel
import com.azamjon.suminshoplist.data.ShopListRepositoryImpl
import com.azamjon.suminshoplist.domain.GetShopListUseCase
import com.azamjon.suminshoplist.domain.EditShopItemUseCase
import com.azamjon.suminshoplist.domain.RemoveShopItemUseCase
import com.azamjon.suminshoplist.domain.model.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    //снизу новый LiveData лист
    val shopList = getShopListUseCase.getShopList()

    fun removeItem(shopItem: ShopItem) {
        removeShopItemUseCase.removeShopItem(shopItem = shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItemUseCase(newItem)
    }
}