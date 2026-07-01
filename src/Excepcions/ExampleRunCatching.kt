package Excepcions

fun main() {
    val number = runCatching { "1a23".toInt() }.getOrDefault(0)

    val number1 = runCatching { "123".toInt() }
        .onSuccess { println("The process end, converted: $it") }

    println(number)
    }