package com.azamjon.suminshoplist.data

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.azamjon.suminshoplist.data.model.ShopItemDbModel

//это класс, где создается база данных
@Database(entities = [ShopItemDbModel::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun shopListDao(): ShopListDao

    companion object {
        private var INSTANCE_DB: AppDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "shop_item_db"

        fun getInstance(application: Application): AppDatabase {
            INSTANCE_DB?.let {
                return it
            }

            /*из разных потоков мы можем запросить базу данных (в данном случае 'INSTANCE'), в итоге
            один поток подумав, что база данных равна null, создаст новую, и таким образом поступит
            другой поток. чтобы этого не было мы его синхронизируем. Для этого нужен обьект любого
            типа (в данном случае 'LOCK'). LOCK нужен для того чтобы, если придет другой поток, он
            увидет LOCK и будет знать что база данных сейчас занята и будет ждать. Когда первый
            метод закончит свое дело, второй метод увидет чтобы базе данных уже присвоено значение и
            заберет готовое значение*/

            synchronized(LOCK) {
                INSTANCE_DB?.let {
                    return it
                }
                val db = Room.databaseBuilder(
                    application,
                    AppDatabase::class.java,
                    DB_NAME
                )
                    /*.allowMainThreadQueries() *//*здесь говорим что якобы выполнять запросы на главном
                        потоке это для нас нормально, но в реальном приложении так делать не надо
                        это только для тестов*/
                    .build()
                INSTANCE_DB = db
                return db
            }
        }
    }
}