package fr.but.sae2024.edukid.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games")
data class Game(

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "theme")
    val theme: String,

    @ColumnInfo(name = "image")
    val image: String? = null,
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}
