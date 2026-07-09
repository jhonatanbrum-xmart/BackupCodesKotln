package exceptions

fun createUser(name: String) {
    require(name.isNotEmpty())
    println(name)
}

fun main() {
    try {
        createUser(name = "")
    } catch (_: IllegalArgumentException) {
        println("The name is not valid")
    }
    try {
        createUser(name = "John")
    } catch (_: IllegalArgumentException) {
        println("The name is not valid")
    }
}
//The expected output is a text saying "The name is not valid" and a text saying "John"
