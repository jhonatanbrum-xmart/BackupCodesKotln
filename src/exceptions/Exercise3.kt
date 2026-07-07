package exceptions

fun main(){
    try {
        println("Opening file...")
        val a = 1/0
        println("End of try")
    } catch (_: ArithmeticException){
        println("")
    }finally {
        println("Closing file...")
    }
}

//The expecting output is "Opening file... Closing file..."