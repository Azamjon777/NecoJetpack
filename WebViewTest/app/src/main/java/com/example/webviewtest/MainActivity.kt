package com.example.webviewtest

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.webviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webViewSetup()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup() {
        binding.webView.webViewClient = WebViewClient()

        binding.webView.apply {
            loadUrl("https://student.fbtuit.uz/dashboard/login")
            settings.javaScriptEnabled = true

        }
    }
}