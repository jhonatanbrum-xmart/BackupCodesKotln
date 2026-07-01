package Excepcions

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