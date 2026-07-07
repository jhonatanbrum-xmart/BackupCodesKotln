package excepcions

fun main(){
    val number1 = 0
    val wachiwachiwa = try {
        number1/100
    } catch (e: ArithmeticException){
        0
    }
    println(wachiwachiwa)
    val juan = runCatching{ number1/100 }.getOrDefault(0)
    println(juan)
}
//The expected result its 0 0, because in the 2 modes the exception is an ArithmeticException and the code for it is set the value in 0.