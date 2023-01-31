package com.azamjon.suminshoplist.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.azamjon.suminshoplist.data.model.ShopItemDbModel

@Dao
interface ShopListDao {

    @Query("SELECT * FROM shop_items")//shop_items это название нашей таблицы
    fun getShopList(): LiveData<List<ShopItemDbModel>>

    /*то что внутри скобок обозначает что если в нашу добавится новый обьект с тем же id, то
     он перезапишется, иначе будет добавлен новыйц*/
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addShopItem(shopItemDbModel: ShopItemDbModel)

    @Query("DELETE FROM shop_items WHERE id=:shopItemId")
    fun deleteShopItem(shopItemId: Int)

    //здесь LIMIT=1 чтобы по данному запросу всегда возвращался 1 элемент
    @Query("SELECT * FROM shop_items WHERE id=:shopItemId LIMIT 1")
    fun getShopItem(shopItemId: Int): ShopItemDbModel
}