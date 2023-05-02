package com.azamjon.suminshoplist.data

import com.azamjon.suminshoplist.data.model.ShopItemDbModel
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopListMapper {
    fun mapEntityToDb(shopItem: ShopItem): ShopItemDbModel {
        return ShopItemDbModel(
            id = shopItem.id,
            name = shopItem.name,
            count = shopItem.count,
            enabled = shopItem.enabled
        )
    }

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel): ShopItem {
        return ShopItem(
            name = shopItemDbModel.name,
            count = shopItemDbModel.count,
            enabled = shopItemDbModel.enabled,
            id = shopItemDbModel.id
        )
    }

    fun mapListDbModelToListEntity(list: List<ShopItemDbModel>) = list.map {
        //если что наш map{} не может работать с LiveData
        //снизу наш метод, который будет вызываться для каждого Entity
        mapDbModelToEntity(it)
    }
}