import java.util.Locale.getDefault

fun ejercicio2() {
    val num1 = 12
    val num2 = 4
    val difference = num1 - num2
    val sum = num1 + num2
    val product = num1 * num2
    println("$difference, $sum, $product")
}

fun ejercicio3() {
    val me = "Jhonatan"
    println("${me.length}, ${me.uppercase(getDefault())}")
}

fun ejercicio4() {
    val vof = !true
    println(vof)
}

fun ejercicio5() {
    val numbersArraysCreatedForMe = arrayOf(1, 2, 3, 4, 5)
    println("${numbersArraysCreatedForMe.first()}, ${numbersArraysCreatedForMe.last()}")
}

fun ejercicio6() {
    val favoriteApps = listOf("IntelliJ IDEA", "Android Studio", "WhatsApp", "TikTok", "Discord")
    val randomApp = "TikTok"
    if (favoriteApps.contains(randomApp)) {
        println("The app: $randomApp is part of your favourite apps.")
    } else {
        println("The app: $randomApp isn't part of your favourite apps.")
    }
}

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
}