fun exercise1() {
    val year: Int = 1234
    val longer: Long = 2000000000000
    val flotant: Float = 3.14F
    val bool: Boolean = true
    val character: Char = ','
    val text: String = "Hola"
    val names = arrayOf("Eliza", "Miguel", "Juan")
    val numbers = listOf("One", "Two", "Three")
    val mutantNumbers = mutableListOf("One", "Two", "Three", "four")
    fun ints() {
        year.minus(12)
        year.plus(1)
        year.toString()
        println(year.toFloat()-1.1) //Permite agregarle un valor "flotante" al momento de escribir un tipo Int
        println(year.toChar()) //Convierte el numero entero al equivalente en simbolo(caracter).
    }
    fun longs(){
        longer.compareTo(year)
        longer.toString()
        longer.plus(1)
        Long.MIN_VALUE //Permite conocer el minimo valor posible de un tipo Long
        longer.toFloat() //Permite agregarle un valor "flotante" al moemnto de escribir o usar un tipo Long
    }
    fun floats() {
        flotant.toString()
        flotant.plus(1)
        flotant.times(1)
        flotant.isFinite() //Devuelve true si el valor esta dentro de los numeros que no son ni NaN ni infinito
        flotant.isInfinite() //Devuelve true si el falor es infinito, sea positivo o negativo
    }
    fun booleans(){
        bool.not()
        bool.compareTo(false)
        bool.toString()
        bool.or(bool) //Devuelve verdadero si al menos uno es verdadero
        bool.and(bool) //Devuelve verdadero si los 2 son verdaderos, en otro caso dara falso
    }
    fun chars(){
        character.isLetter()
        character.isDigit()
        character.uppercaseChar()
        character.lowercaseChar() //Devuelve el caracter en minuscula en caso de ser una letra, si no devuelve el mismo  tal cual
        character.isLetterOrDigit() //Infoma si el numero proveido es una letra o es un digito.
    }
    fun strings(){
        text.length
        text.uppercase()
        text.substring(0, 1)
        text.get(1) //Obtiene el caracter(sea letra, digito, numero, caracter especial, etc) en la posicion que se especifica
        text.startsWith("a") //Comprueba si el texto comienza con ese caracter o no.
    }
    fun arrays(){
        names.size
        names.get(1)
        names.set(1, "Pepe")
        names.first() //Obtiene el primer elemento del array
        names.last() //Obtiene el ultimo elemento del array
    }
    fun lists() {
        numbers.size
        numbers.contains("one")
        numbers.forEach { number -> println(number) }
        numbers.firstOrNull() //Obtiene el primer elemento de la lista o devuelve Null si la lista esta vacia
        numbers.lastOrNull() //Obtiene el ultimo elemento del lista o devuelve Null si la lista esta vacia
    }
    fun mutablelists(){
        mutantNumbers.add("four")
        mutantNumbers.remove("four")
        mutantNumbers.removeAt(2) //Remueve el elemento que este en esa casilla de la lista
        mutantNumbers.clear()
        mutantNumbers.removeIf { number ->  number == "Three" }  //Remueve los elementos que cumplan con las condiciones del if
    }
    println("$year $longer $flotant $bool $character $text ${names.contentToString()} ${numbers} $mutantNumbers")
    println("$year $longer $flotant")
}