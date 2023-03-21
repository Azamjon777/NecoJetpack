package com.azamjon.suminshoplist.domain.model

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = 0
        /*здесь присваивание числа 0 обозначает, что room сам сгенерирует id для ShopItem, а любое
        другое число room будет думать, что это какой то уже сушествующий id, и поэтому будет
        редактировать этот ShopItem*/
    }
}
