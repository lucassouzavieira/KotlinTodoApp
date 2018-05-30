package com.lvieira

interface IRowListener {
    fun modifyItemState(itemObjectId: String, isDone: Boolean)

    fun onItemDelete(itemObjectId: String)
}