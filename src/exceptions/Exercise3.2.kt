package exceptions

fun main(){
    val num = runCatching { "4l2".toInt() }
        .onFailure { println("Could not convert") }
        .onSuccess { println("Converted successfully: $it") }

}
//The expected result of this code is it send an error with println "Could not convert" because the letter "l" cant be a number.