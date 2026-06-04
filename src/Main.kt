fun main() {
    val year: Int = 1234
    val longer: Long = 2000000000000
    val flotant: Float = 3.14F
    val bool: Boolean = true
    val character: Char = ','
    val text: String = "Hola"
    val names = arrayOf("Eliza", "Miguel", "Juan")
    val numbers = listOf("One", "Two", "Three")
    val mutantNumbers = mutableListOf("One", "Two", "Three")
    println("\$year $year $longer $flotant $bool $character $text $names ${numbers} $mutantNumbers")
    println("$year $longer $flotant")
}