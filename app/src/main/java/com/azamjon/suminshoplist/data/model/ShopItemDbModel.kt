package com.azamjon.suminshoplist.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shop_items") //здесь задаем имя нашей таблице
data class ShopItemDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean
)