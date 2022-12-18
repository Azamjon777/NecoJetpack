package com.azamjon.suminshoplist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.azamjon.suminshoplist.domain.ShopListRepository
import com.azamjon.suminshoplist.domain.model.ShopItem

object ShopListRepositoryImpl : ShopListRepository {
    private val shopListLiveData = MutableLiveData<List<ShopItem>>()
    private val shopList = sortedSetOf<ShopItem>({ o1, o2 -> o1.id.compareTo(o2.id) })

//    private val shopList = sortedSetOf<ShopItem>(object : Comparator<ShopItem> {
//        override fun compare(shopItem1: ShopItem?, shopItem2: ShopItem?): Int {
//            return compare(shopItem1, shopItem2)
//        }
//    })   // но так длинне


    private var autoIncrementId = 0

    init {
        for (i in 0 until 10) {
            val item = ShopItem(name = "name: $i ", i, true)
            addShopItem(item)
        }
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId
            autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()
    }

    override fun getShopItemById(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId }
            ?: throw RuntimeException("Element with $shopItemId not found")
    }

    override fun getShopList(): LiveData<List<ShopItem>> {
        return shopListLiveData
    }

    override fun refactorShopItemUseCase(shopItem: ShopItem) {
        val oldElement = getShopItemById(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun removeShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    private fun updateList() {
        shopListLiveData.value = shopList.toList()
    }
}