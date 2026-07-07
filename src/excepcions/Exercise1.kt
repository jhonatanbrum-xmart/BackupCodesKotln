package excepcions

fun main(){
    val ftgh = try {
        "123a".toInt()
    } catch (e: NumberFormatException){
        println("Please enter a valid number.")
    }

}
//The expected result of this is a text saying "Please enter a valid number." because the letter 'a' cant be a int number, and it converts send an NumberFormatException