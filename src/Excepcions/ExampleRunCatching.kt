package Excepcions

fun main() {
    val number = runCatching { "1a23".toInt() }.getOrDefault(0)

    val number1 = runCatching { "123".toInt() }
        .onSuccess { println("The process end, converted: $it") }

    println(number)
    println(number1)
    }
//The expected result of this code is a "0" and a text saying "The process end, converted: 123".