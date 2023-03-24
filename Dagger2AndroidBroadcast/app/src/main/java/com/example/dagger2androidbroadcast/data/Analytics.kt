@file:Suppress("UNUSED_PARAMETER")

package com.example.dagger2androidbroadcast.data

import javax.inject.Inject

class Analytics @Inject constructor() {

    fun trackScreenShow() {
    }

    fun trackNewsRequest(newsId: String) {
        // Do nothing
    }
}