package exceptions

fun main(){
    val age: Int = try {
        "25".toInt()
    } catch(e: NumberFormatException){
        -1
    }
    println(age)
}
//The expected output will "25"