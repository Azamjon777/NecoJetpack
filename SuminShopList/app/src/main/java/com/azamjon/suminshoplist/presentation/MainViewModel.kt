package com.azamjon.suminshoplist.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.azamjon.suminshoplist.data.realization.ShopListRepositoryImpl
import com.azamjon.suminshoplist.domain.EditShopItemUseCase
import com.azamjon.suminshoplist.domain.GetShopListUseCase
import com.azamjon.suminshoplist.domain.RemoveShopItemUseCase
import com.azamjon.suminshoplist.domain.model.ShopItem
import kotlinx.coroutines.launch

/*теперь мы наследуемся от AndroidViewModel, а не ViewModel, так как нам нужен application для
ShopListRepositoryImpl*/
class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = ShopListRepositoryImpl(application)

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)


/*    *//*здесь тупо говоря мы берем CoroutineContext. здесь мы передаем поток на котором будет
    выполняться корутина. Для этого используется класс Dispatchers. обычно оттуда вызываем 'IO'.
    это для чтения и записи. IO, если нету свободных потоков, создаст новый поток, пока их кол-во
    не будет состовлять 64.
    Dispatchers.Main - корутины выполняются на главном потоке
    Dispatchers.Default - исп-ся для сложных задач. макс кол-во потоков = кол-во ядер в процессоре
    Dispatchers.IO - исп-ся для чтения и записи
    Dispatchers.Unconfined - не исп-ся в реальных приложениях*//*
    private val scope = CoroutineScope(Dispatchers.Main)*/

    //снизу новый LiveData лист
    val shopList = getShopListUseCase.getShopList()

    fun removeItem(shopItem: ShopItem) {
        viewModelScope.launch {
            removeShopItemUseCase.removeShopItem(shopItem = shopItem)
        }
    }

    fun changeEnableState(shopItem: ShopItem) {
        viewModelScope.launch {
            val newItem = shopItem.copy(enabled = !shopItem.enabled)
            editShopItemUseCase.editShopItemUseCase(newItem)
        }
    }
}