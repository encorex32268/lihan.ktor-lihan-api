package lihan.model

import kotlinx.serialization.Serializable

@Serializable
data class Food(
    val name : String ,
    val price : Int ,
    val address : String ,
    val image : String
)
