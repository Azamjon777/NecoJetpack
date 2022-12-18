package com.azamjon.suminshoplist.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.azamjon.suminshoplist.R
import com.azamjon.suminshoplist.domain.model.ShopItem

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var llShopList: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        llShopList = findViewById(R.id.ll_shop_list)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.shopList.observe(this) {
            showList(it)
        }
    }

    private fun showList(list: List<ShopItem>) {
        llShopList.removeAllViews()
        for (shopItem in list) {
            val layout = if (shopItem.enabled) {
                R.layout.item_shop_enabled
            } else {
                R.layout.item_shop_disabled
            }
            val view = LayoutInflater.from(this).inflate(layout, llShopList, false)

            val tvDisName = view.findViewById<TextView>(R.id.tv_name)
            val tvDisCount = view.findViewById<TextView>(R.id.tv_count)
            tvDisName.text = shopItem.name
            tvDisCount.text = shopItem.count.toString()

            view.setOnLongClickListener {
                viewModel.refactorShopItem(shopItem)
                true
            }
            llShopList.addView(view)
        }
    }

}