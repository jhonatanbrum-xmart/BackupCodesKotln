package Excepcions

fun main() {
    try {
        val x = 10 / 0
    } catch (e: RuntimeException) {
        println("Runtime")
    } catch (e: ArithmeticException) {
        println("Arithmetic")
    }

}
//The expected code output was: Runtime
