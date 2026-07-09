package exceptions

private class BankAccount(val open: Boolean, var money: Int) {
    fun withdraw(amount: Int) {
        check(open)
        check(money >= amount)
        money -= amount
    }
}

fun main() {
    val account = BankAccount(open = true, money = 100)
    account.withdraw(amount = 100)
    println(account.money)
    try {
        val account2 = BankAccount(open = false, money = 99)
        account2.withdraw(amount = 100)
        println(account2.money)
    } catch (_: IllegalStateException) {
        println("You dont have sufficient amount of money to the withdraw or you dont have an opened account.")
    }
}
// The expected output will a number "0" and a text saying "You dont have sufficient amount of money to the withdraw or you dont have an opened account."
