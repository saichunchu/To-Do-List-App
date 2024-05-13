package com.example.mywishlistapp

import android.content.Context
import androidx.room.Room
import com.example.mywishlistapp.data.WishDataBase
import com.example.mywishlistapp.data.WishRepository

object Graph {

    lateinit var dataBase: WishDataBase

    val wishRepository by lazy {
       WishRepository(wishDao = dataBase.wishDao())

    }

    fun provide(context: Context){
        dataBase = Room.databaseBuilder(context,
            WishDataBase::class.java,"wishlist.db").build()
    }
    //dependency injection ..acts as a helper handing out the required things to the part sod the code ..makingg the app smooth


}