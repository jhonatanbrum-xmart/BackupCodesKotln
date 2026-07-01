package Excepcions

fun main(){
    val num = runCatching { "4l2".toInt() }
        .onFailure { println("Could not convert") }
        .onSuccess { println("Converted successfully: $it") }

}