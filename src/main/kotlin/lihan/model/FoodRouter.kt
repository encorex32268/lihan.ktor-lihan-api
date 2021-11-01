package lihan.model

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

const val BASE_URL = "http://cf6c-160-237-147-77.ngrok.io"
val foods = arrayListOf<Food>(
    //http://localhost:8080/static/food/food5.png
    Food("牛肉麵",110,"台北市大安區敦化南路1段151號1樓","$BASE_URL/static/food/food1.png"),
    Food("滷肉飯",10,"台北市大同區延平北路二段 No. 233 號","$BASE_URL/static/food/food2.png"),
    Food("蚵仔煎",65,"台北市大同區寧夏路46號","$BASE_URL/static/food/food3.png"),
    Food("蚵仔麵線",40,"台北市萬華區大理街93號1樓","$BASE_URL/static/food/food4.png"),
    Food("牛排",150,"台灣台北市士林區大南路85號","$BASE_URL/static/food/food5.png")
)


fun Route.foodRandom(){

    get("/foodRandom") {
        call.respond(
            HttpStatusCode.OK,
            foods.random()
        )


    }

}