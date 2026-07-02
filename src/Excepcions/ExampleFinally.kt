package Excepcions

class JhonaException: Exception("Hello, i am the Jhonatan exception!")

fun main(){
    try {
        throw JhonaException()
    }
    catch (e: JhonaException) {
        println("Yep, this is an exception.")
    }
    finally {
        println("And for no reason:")
        throw IllegalArgumentException()
    }
}
//The expected result is a text saying "Yep, this is an exception." and "And for no reason:" to finish with a IllegalArgumentException