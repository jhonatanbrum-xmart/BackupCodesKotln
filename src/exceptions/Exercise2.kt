package exceptions

fun divide(a: Int, b: Int): Int = a / b

fun main() {
    val test1 = try {
        divide(a = 1, b = 0)
    } catch (_: ArithmeticException) {
        println("Cannot divide by zero.")
    }
    println(test1)
}
// The expected result is a text saying "Cannot divide by zero."
