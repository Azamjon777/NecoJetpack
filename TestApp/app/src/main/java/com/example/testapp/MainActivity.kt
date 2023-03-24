package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = "http://example.com?source=google&campaign=test"
        val params = parseUrl(url)

        binding.sourceResult.text = params["source"]
        binding.companyResult.text = params["campaign"]
        binding.reference.text = "http://example.com?source=google&campaign=test"

    }

    private fun parseUrl(url: String): HashMap<String, String> {
        val pattern = "(?:\\?|&)(\\w+)=([^&]+)".toRegex()
        val matches = pattern.findAll(url)
        val params = HashMap<String, String>()

        for (match in matches) {
            params[match.groupValues[1]] = match.groupValues[2]
        }

        return params
    }
}