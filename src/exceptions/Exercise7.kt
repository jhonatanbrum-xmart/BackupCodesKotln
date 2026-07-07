package exceptions

private class BankAccount(val open: Boolean, var money: Int) {
    fun withdraw(amount: Int) {
        check(open)
        money -= amount
    }
}

fun main(){
    val account = BankAccount(true, 100)
    check((account.money>=100))
    account.withdraw(100)
    println(account.money)
    val account2 = BankAccount(false, 100)
    check((account2.money >= 100))
    account2.withdraw(100)
    println(account2.money)
}
// The expected output will a number "0" and a IllegalStateException