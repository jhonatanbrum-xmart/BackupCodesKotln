fun ejercicio7() {
    var mutableListCreatedForMe = mutableSetOf<String>()
    mutableListCreatedForMe.add("Mutable")
    mutableListCreatedForMe.add("List")
    mutableListCreatedForMe.add("Created for me")
    mutableListCreatedForMe.remove("Created for me")
    println(mutableListCreatedForMe)
}

fun ejercicio8() {
    val hooray = '·'
    when (hooray) {

    }
    if (hooray.isLetter()) {
        println("Hooray")
    } else if (hooray.isDigit()) {
        println("Hooray?")
    } else {
        println("Bruh, it was a letter or a digit, not a letter, digit or a random character of your mind.")
    }
}

fun ejercicio9() {
    val numero = 0
    println(numero.toString() + 123)
}

fun main() {
    exercise1()
    exercise2()
    exercise3()
    exercise4()
    exercise5()
    exercise6()
}