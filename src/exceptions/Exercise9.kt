package exceptions

fun main() {
    try {
        val result = 10 / 0
        println(result)
    } catch (_: ArithmeticException) {
        println("Cannot divide by zero.")
        try {
            val a: Int = "abc".toInt()
            println(a)
        } catch (_: NumberFormatException) {
            println("Invalid number entered.")
        }
    }
}

//The expected output was a 2 text, one said "Cannot divide by zero." and the other said "Invalid number entered."
