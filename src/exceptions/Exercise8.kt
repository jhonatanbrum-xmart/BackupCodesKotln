package exceptions

fun main() {
    val name: String? = null
    try {
        println(name!!)
    } catch (_: NullPointerException) {
        println("Unknown user")
    }
    println(
        if (name?.length == null) {
            "Unknown user"
        } else {
            name
        }
    )
    println(name ?: "Unknown user")
}
//The expected output will 3 lines of texts saying "Unknown user"
