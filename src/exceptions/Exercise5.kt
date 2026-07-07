package exceptions
fun registerAge(age: Int){
    if(age<0){
        throw IllegalArgumentException("Age cant be negative")
    }
}
fun main(){
    registerAge(-1)
}
//The expected is an IllegalArgumentException