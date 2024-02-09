package com.sm.instagramclone.data

open class EventHandle<out T>(private val content: T){
    private var hasBeenHandle = false
        private set
    fun getContentOrNull(): T?{
        return if (hasBeenHandle){
            null
        } else {
            hasBeenHandle = true
            content
        }
    }
}