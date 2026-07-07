package exceptions

fun main(){
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero.")
        try {
            val a: Int = "abc".toInt()
        }catch (e: NumberFormatException) {
            println("Invalid number entered.")
        }
    }
}

//The expected output was a 2 text, one said "Cannot divide by zero." and the other said "Invalid number entered."