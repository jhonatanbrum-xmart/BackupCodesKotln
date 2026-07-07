package exceptions

fun divide(a: Int, b: Int): Int {
    val asd = a / b
    return asd
}
fun main(){
    val test1 = try {
        divide(1, 0)
    } catch(_: ArithmeticException){
        println("Cannot divide by zero.")
    }
    println(test1)
}
// The expected result is a text saying "Cannot divide by zero."