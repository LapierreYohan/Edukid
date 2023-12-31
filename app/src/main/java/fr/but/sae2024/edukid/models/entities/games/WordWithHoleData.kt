package fr.but.sae2024.edukid.models.entities.games

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (
    tableName = "word_with_hole_data",
    primaryKeys = ["user_id", "result"]
)
data class WordWithHoleData(

    @ColumnInfo(name = "user_id")
    var userId : Int,

    @ColumnInfo(name = "result")
    var result : String,

    @ColumnInfo(name = "difficulty")
    var difficulty : Int,

    @ColumnInfo(name = "win")
    var win : Int,

    @ColumnInfo(name = "win_streak")
    var winStreak : Int,

    @ColumnInfo(name = "lose")
    var lose : Int,

    @ColumnInfo(name = "lose_streak")
    var loseStreak : Int,

    @ColumnInfo(name = "last_used")
    var lastUsed : Int,
)