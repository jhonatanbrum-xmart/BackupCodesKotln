fun main() {
    /* EJERCICIO 1
    val year: Int = 1234
    val longer: Long = 2000000000000
    val flotant: Float = 3.14F
    val bool: Boolean = true
    val character: Char = ','
    val text: String = "Hola"
    val names = arrayOf("Eliza", "Miguel", "Juan")
    val numbers = listOf("One", "Two", "Three")
    val mutantNumbers = mutableListOf("One", "Two", "Three")
    println("$year $longer $flotant $bool $character $text ${names.contentToString()} ${numbers} $mutantNumbers")
    println("$year $longer $flotant")*/
    /* EJERCICIO 2
    var num1 = 10
    var num2 = 4
    var difference = num1 + num2
    var sum = num1 - num2
    var product = num1 % num2
    println("$difference, $sum, $product")*/
    /* EJERCICIO 3
    val me = "Jhonatan"
    println("${me.length}, ${me.uppercase(getDefault())}")*/
    /* EJERCICIO 4
    val vof = !true
    println(vof)*/
    /* EJERCICIO 5
    val numbersArraysCreatedForMe = arrayOf(1,2,3,4,5)
    println("${numbersArraysCreatedForMe.first()}, ${numbersArraysCreatedForMe.last()}")*/
    /* EJERCICIO 6
    val favoriteApps = listOf("IntelliJ IDEA", "Android Studio", "WhatsApp", "TikTok", "Discord")
    val randomApp = "TikTok"
    if (favoriteApps.contains(randomApp)) {
        println("La app: $randomApp si esta dentro de las apps favoritas.")
    } else {
        println("La app: $randomApp no esta dentro de las apps favoritas.")
    }*/
    /* EJERCICIO 7
    var mutableListCreatedForMe = mutableSetOf<String>()
    mutableListCreatedForMe.add("Mutable")
    mutableListCreatedForMe.add("List")
    mutableListCreatedForMe.add("Created for me")
    mutableListCreatedForMe.remove("Created for me")
    println(mutableListCreatedForMe) sd*/
    /* EJERCICIO 8 */
    val hooray: Char = '·'
    if (hooray.isLetter()) {
        println("Hooray")
    } else if (hooray.isDigit()) {
        println("Hooray?")
    } else {
        println("Bruh, era letra o digito, no letra, digito o alguna cosa que se te ocurra de la nada, intentalo de nuevo por favor.")
    }
}