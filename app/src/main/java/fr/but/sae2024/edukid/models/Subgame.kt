package fr.but.sae2024.edukid.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subgames")
data class Subgame(
    @ColumnInfo(name = "name")
    val name: String,
    
    @ColumnInfo(name = "game")
    val theme: Int,

    @ColumnInfo(name = "image")
    val image: Int? = null,
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}
