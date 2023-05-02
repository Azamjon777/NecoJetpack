package com.azamjon.suminshoplist.data.realization

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.azamjon.suminshoplist.data.AppDatabase
import com.azamjon.suminshoplist.data.ShopListMapper
import com.azamjon.suminshoplist.domain.repository.ShopListRepository
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopListRepositoryImpl(
    application: Application
) : ShopListRepository {

    private val shopListDao = AppDatabase.getInstance(application).shopListDao()

    private val mapper = ShopListMapper()

    override suspend fun addShopItem(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDb(shopItem))
    }

    override suspend fun getShopItemById(shopItemId: Int): ShopItem {
        val dbModel = shopListDao.getShopItem(shopItemId)
        return mapper.mapDbModelToEntity(dbModel)
    }

    /*/*MediatorLiveData это такой класс, который перехватывает обьекты другой LiveData и както их
    обрабатывает*/
    override suspend fun getShopList(): LiveData<List<ShopItem>> = MediatorLiveData<List<ShopItem>>().apply {
        addSource(shopListDao.getShopList()) {
            //в лямбда выражении приходит только list без LiveData
            value = mapper.mapListDbModelToListEntity(it)
        }
    }*/

    override suspend fun editShopItemUseCase(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDb(shopItem))
    }

    override suspend fun removeShopItem(shopItem: ShopItem) {
        shopListDao.deleteShopItem(shopItem.id)
    }

    override fun getShopList(): LiveData<List<ShopItem>> = Transformations.map(
        /*этот map(), который находится внутри класса Transformations, делает абсолютно
                тоже самое, что и  MediatorLiveData, только не надо все делать вручную*/
        shopListDao.getShopList()
    ) {
        //в лямбда выражении приходит list без LiveData
        mapper.mapListDbModelToListEntity(it)
    }
}