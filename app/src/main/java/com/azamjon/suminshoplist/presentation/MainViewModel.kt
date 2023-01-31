package com.azamjon.suminshoplist.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.azamjon.suminshoplist.data.repository.ShopListRepositoryImpl
import com.azamjon.suminshoplist.domain.EditShopItemUseCase
import com.azamjon.suminshoplist.domain.GetShopListUseCase
import com.azamjon.suminshoplist.domain.RemoveShopItemUseCase
import com.azamjon.suminshoplist.domain.model.ShopItem

/*теперь мы наследуемся от AndroidViewModel, а не ViewModel, так как нам нужен application для
ShopListRepositoryImpl*/
class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = ShopListRepositoryImpl(application)

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