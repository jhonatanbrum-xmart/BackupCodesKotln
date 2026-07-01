package Excepcions

class jhonaException: Exception("Hello, i am the Jhonatan exeption!")

fun main(){
    try {
        throw jhonaException()
    }
    catch (e: jhonaException) {
        println("Yep, this is an exeption.")
    }
    finally {
        println("And for no reason:")
        throw IllegalArgumentException()
    }
}