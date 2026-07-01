package Excepcions

fun main() {
    try {
     throw IllegalArgumentException()
    }
    catch (e: Exception) {
        println("Error")
    }
    finally {
        println("Closing resources")
    }
    try {
        val x = 10 / 0
    } catch (e: RuntimeException) {
        println("Runtime")
    } catch (e: ArithmeticException) {
        println("Arithmetic")
    }

}
//The code output was: Runtime

fun master(){
    val awasdkhuj = "1, 2, 3"
}