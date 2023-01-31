package com.azamjon.suminshoplist.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.azamjon.suminshoplist.data.AppDatabase
import com.azamjon.suminshoplist.data.ShopListMapper
import com.azamjon.suminshoplist.domain.ShopListRepository
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopListRepositoryImpl(
    application: Application
) : ShopListRepository {

    private val shopListDao = AppDatabase.getInstance(application).shopListDao()

    private val mapper = ShopListMapper()

    /*private val shopListLiveData = MutableLiveData<List<ShopItem>>()
    private val shopList = sortedSetOf<ShopItem>({ o1, o2 -> o1.id.compareTo(o2.id) })
    // сверху код для того чтобы при активации и дизактивации item-ы оставались на своей позиции...?

//    private val shopList = sortedSetOf<ShopItem>(object : Comparator<ShopItem> {
//        override fun compare(shopItem1: ShopItem?, shopItem2: ShopItem?): Int {
//            return compare(shopItem1, shopItem2)
//        }
//    })   // но так длиннее

    private var autoIncrementId = 0

    init {
        for (i in 0..10) {
            val item = ShopItem("Name: $i", i, Random.nextBoolean(), i)
            addShopItem(item)
        }
    }
*/
    override fun addShopItem(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDb(shopItem))
    }

    override fun getShopItemById(shopItemId: Int): ShopItem {
        val dbModel = shopListDao.getShopItem(shopItemId)
        return mapper.mapDbModelToEntity(dbModel)
    }

    /*/*MediatorLiveData это такой класс, который перехватывает обьекты другой LiveData и както их
    обрабатывает*/
    override fun getShopList(): LiveData<List<ShopItem>> = MediatorLiveData<List<ShopItem>>().apply {
        addSource(shopListDao.getShopList()) {
            //в лямбда выражении приходит только list без LiveData
            value = mapper.mapListDbModelToListEntity(it)
        }
    }*/

    override fun getShopList(): LiveData<List<ShopItem>> = Transformations.map(
        /*этот map(), который находится внутри класса Transformations, делает абсолютно
                тоже самое, что и  MediatorLiveData, только не надо все делать вручную*/
        shopListDao.getShopList()
    ){
        //в лямбда выражении приходит list без LiveData
        mapper.mapListDbModelToListEntity(it)
    }

    override fun editShopItemUseCase(shopItem: ShopItem) {
        shopListDao.addShopItem(mapper.mapEntityToDb(shopItem))
    }

    override fun removeShopItem(shopItem: ShopItem) {
        shopListDao.deleteShopItem(shopItem.id)
    }
}