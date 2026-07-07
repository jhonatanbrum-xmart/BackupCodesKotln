package exceptions

fun main(){
    val name: String? = null
    try{println(name!!)
    }catch (e: NullPointerException){
        println("Unknown user")
    }
    println(if(name?.length == null){"Unknown user"}else{name})
    println(name ?: "Unknown user")
}