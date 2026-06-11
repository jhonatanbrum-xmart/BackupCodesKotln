import java.util.Locale.getDefault

fun ejercicio1() {
    val year: Int = 1234
    val longer: Long = 2000000000000
    val flotant: Float = 3.14F
    val bool: Boolean = true
    val character: Char = ','
    val text: String = "Hola"
    val names = arrayOf("Eliza", "Miguel", "Juan")
    val numbers = listOf("One", "Two", "Three")
    val mutantNumbers = mutableListOf("One", "Two", "Three", "four")
    year.minus(12)
    year.plus(1)
    year.toString()
    println(year.toFloat()-1.1) //Permite agregarle un valor "flotante" al momento de escribir un tipo Int
    println(year.toChar()) //Convierte el numero entero al equivalente en simbolo(caracter).
    longer.compareTo(year)
    longer.toString()
    longer.plus(1)
    Long.MIN_VALUE //Permite conocer el minimo valor posible de un tipo Long
    longer.toFloat() //Permite agregarle un valor "flotante" al moemnto de escribir o usar un tipo Long
    flotant.toString()
    flotant.plus(1)
    flotant.times(1)
    flotant.isFinite() //Devuelve true si el valor esta dentro de los numeros que no son ni NaN ni infinito
    flotant.isInfinite() //Devuelve true si el falor es infinito, sea positivo o negativo
    bool.not()
    bool.compareTo(false)
    bool.toString()
    bool.or(bool) //Devuelve verdadero si al menos uno es verdadero
    bool.and(bool) //Devuelve verdadero si los 2 son verdaderos, en otro caso dara falso
    character.isLetter()
    character.isDigit()
    character.uppercaseChar()
    character.lowercaseChar() //Devuelve el caracter en minuscula en caso de ser una letra, si no devuelve el mismo  tal cual
    character.isLetterOrDigit() //Infoma si el numero proveido es una letra o es un digito.
    text.length
    text.uppercase()
    text.substring(0, 1)
    text.get(1) //Obtiene el caracter(sea letra, digito, numero, caracter especial, etc) en la posicion que se especifica
    text.startsWith("a") //Comprueba si el texto comienza con ese caracter o no.
    names.size
    names.get(1)
    names.set(1, "Pepe")
    names.first() //Obtiene el primer elemento del array
    names.last() //Obtiene el ultimo elemento del array
    numbers.size
    numbers.contains("one")
    numbers.forEach { number -> println(number) }
    numbers.firstOrNull() //Obtiene el primer elemento de la lista o devuelve Null si la lista esta vacia
    numbers.lastOrNull() //Obtiene el ultimo elemento del lista o devuelve Null si la lista esta vacia
    mutantNumbers.add("four")
    mutantNumbers.remove("four")
    mutantNumbers.clear()
    mutantNumbers.removeAt(2) //Remueve el elemento que este en esa casilla de la lista
    mutantNumbers.removeIf { number ->  number == "Three" }  //Remueve los elementos que cumplan con las condiciones del if
    println("$year $longer $flotant $bool $character $text ${names.contentToString()} ${numbers} $mutantNumbers")
    println("$year $longer $flotant")
}

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
    ejercicio1()
}