package Excepcions

fun main(){
    val ftgh = try {
        "123a".toInt()
    } catch (e: NumberFormatException){
        println("Please enter a valid number.")
    }

}