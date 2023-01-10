package com.azamjon.suminshoplist.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.azamjon.suminshoplist.R
import com.azamjon.suminshoplist.domain.model.ShopItem

class ShopItemActivity : AppCompatActivity(), ShopItemFragment.OnEditingFinishedListener {

    private var screenMode = MODE_UNKNOWN
    private var shopItemId = ShopItem.UNDEFINED_ID
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item)
        parseIntent()
        if (savedInstanceState == null) {//эта проверка для того чтобы не создавать повторно onCreate()
            launchRightMode()
        }
    }

    private fun parseIntent() {
        if (!intent.hasExtra(EXTRA_SCREEN_MODE)) {
            throw RuntimeException("Param screen mode is absent")
        }
        val mode = intent.getStringExtra(EXTRA_SCREEN_MODE)
        if (mode != MODE_EDIT && mode != MODE_ADD) {
            throw RuntimeException("Unknown screen mode $mode")
        }
        screenMode = mode
        if (screenMode == MODE_EDIT) {
            if (!intent.hasExtra(EXTRA_SHOP_ITEM_ID)) {
                throw RuntimeException("Param shop item id is absent")
            }
            shopItemId = intent.getIntExtra(EXTRA_SHOP_ITEM_ID, ShopItem.UNDEFINED_ID)
        }
    }

    /*здесь мы запускаем edit или add фрагмент, передавая ShopItemFragment() через функции
    newInstanceEditItem или newInstanceAddItem, а засовывая это в переменную fragment*/
    private fun launchRightMode() {
        val fragment: ShopItemFragment = when (screenMode) {
            MODE_EDIT -> {                 //MODE_EDIT и MODE_ADD это как бы value внутри screenMode
                ShopItemFragment.newInstanceEditItem(shopItemId) //здесь shopItemId уже обработан через parseIntent()
            }
            MODE_ADD -> {
                ShopItemFragment.newInstanceAddItem()
            }
            else -> {
                throw RuntimeException("Unknown screen mode: $screenMode")
            }
        }
        //снизу мы передаем экземпляр класса фрагмента fragment_shop_item и его класс ShopItemFragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.activity_shop_item_container, fragment)
            .commit()
    }

    override fun onEditingFinished() {
        finish()
    }

    companion object {
        private const val EXTRA_SCREEN_MODE = "extra_mode"
        private const val EXTRA_SHOP_ITEM_ID = "extra_shop_item_id"
        private const val MODE_EDIT = "mode_edit"
        private const val MODE_ADD = "mode_add"
        private const val MODE_UNKNOWN = ""
        fun newIntentAddItem(context: Context): Intent {
            val intent = Intent(context, ShopItemActivity::class.java)
            intent.putExtra(EXTRA_SCREEN_MODE, MODE_ADD)
            return intent
        }

        fun newIntentEditItem(context: Context, shopItemId: Int): Intent {
            val intent = Intent(context, ShopItemActivity::class.java)
            intent.putExtra(EXTRA_SCREEN_MODE, MODE_EDIT)
            intent.putExtra(EXTRA_SHOP_ITEM_ID, shopItemId)
            return intent
        }
    }
}