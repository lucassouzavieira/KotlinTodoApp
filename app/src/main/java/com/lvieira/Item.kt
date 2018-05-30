package com.lvieira

class Item() {

    companion object {
        fun new(): Item = Item()
    }

    var objectId: String? = null
    var itemText: String? = null
    var done: Boolean? = false
}