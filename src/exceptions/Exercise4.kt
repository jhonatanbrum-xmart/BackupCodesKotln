package exceptions

fun main() {
    val age: Int = try {
        "25".toInt()
    } catch (_: NumberFormatException) {
        -1
    }
    println(age)
}
//The expected output will "25"
