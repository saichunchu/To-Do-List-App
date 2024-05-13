package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")

data class Wish(

    //primary key should be a unique one which is not repeated ever and can be used to access the row in database
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title:String = "",
    @ColumnInfo(name="wish-desc")
    val description:String=""
)

object DummyWish{
    val  wishList= listOf<Wish>(
        Wish(title="google watch", description = "A Watch"),
        Wish(title="Quest book", description = "A book"),
        Wish(title="App recommendations", description = "to do app"),
        Wish(title="Iphone", description = "15 pro max")

    )



}

