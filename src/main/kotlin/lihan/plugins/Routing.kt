package lihan.plugins

import lihan.model.foodRandom
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {
    

    routing {
        foodRandom()
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
