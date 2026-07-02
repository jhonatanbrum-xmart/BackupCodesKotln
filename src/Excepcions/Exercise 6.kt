package Excepcions

fun createUser(name: String){
 require(name.length >= 1)
}
fun main(){
    createUser("")
}
//The expected output is an IllegalArgumentException