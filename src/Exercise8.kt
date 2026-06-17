fun exercise8() {
    val hooray = '·'
    when {
        hooray.isLetter() -> {
            println("Hooray")
        }
        hooray.isDigit() -> {
            println("Hooray?")
        }
        else -> {
            println("Bruh, it was a letter or a digit, not a letter, digit or a random character of your mind.")
        }
    }
}