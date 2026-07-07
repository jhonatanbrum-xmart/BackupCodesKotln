package exceptions

fun main() {
    val number = runCatching { "1a23".toInt() }.getOrDefault(0)

    val number1 = runCatching { "123".toInt() }
        .onSuccess { resultValue -> println("The process end, converted: $resultValue") }
        .onFailure { println(0) }

    println(number)
    }
//The expected result of this code is a "0" and a text saying "The process end, converted: 123".