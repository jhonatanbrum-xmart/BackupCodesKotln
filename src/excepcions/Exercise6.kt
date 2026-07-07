package excepcions

fun createUser(name: String){
    require(name.isNotEmpty())
    println(name)
}
fun main(){
    try{
    createUser("")
}catch (e: IllegalArgumentException){
    println("The name is not valid")
}
    try {
    createUser("John")
}catch (e: IllegalArgumentException){
    println("The name is not valid")
}}
//The expected output is a text saying "The name is not valid" and a text saying "John"