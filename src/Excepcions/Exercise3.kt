package Excepcions

fun main(){
    try {
        println("Opening file...")
        val a = 1/0
    } catch (_: ArithmeticException){
        println("")
    }finally {
        println("Closing file...")
    }
}

//The expecting output is "Opening file... Closing file..."