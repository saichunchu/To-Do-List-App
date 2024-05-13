package com.example.mywishlistapp.data

import java.util.concurrent.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addAWish(wish: Wish){
        wishDao.addWish(wish)
    }

    fun getWishes() : kotlinx.coroutines.flow.Flow<List<Wish>> =wishDao.getAllWishes()


    fun getAWishById(id:Long): kotlinx.coroutines.flow.Flow<Wish>{
        return wishDao.getAWishById(id)
    }

    suspend fun updateAWish(wish: Wish){
        wishDao.updateWish(wish)
    }
    suspend fun deleteAWish(wish: Wish){
        wishDao.deleteAWish(wish)
    }



}