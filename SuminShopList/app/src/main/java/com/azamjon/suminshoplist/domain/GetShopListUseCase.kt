package com.azamjon.suminshoplist.domain

import androidx.lifecycle.LiveData
import com.azamjon.suminshoplist.domain.model.ShopItem
import com.azamjon.suminshoplist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}