package exceptions

private class ATMaccount(val isOpen: Boolean, private var money: Int) {
    val availableMoney
        get() = money

    fun withdraw(amount: Int) {
        try {
            check(isOpen)
            require(money >= amount)
            money -= amount
        } catch (_: IllegalStateException) {
            println("You dont have an opened account.")
            return
        } catch (_: IllegalArgumentException) {
            println("You dont have the sufficient amount on your account.")
            return
        }
    }
}

fun main() {
    var exitOfSystem: String? = null
    var canExecuteTheExitOfSystem = false
    var account: ATMaccount? = null
    do {
        try {
            if (account == null) {
                println("Write 'Open' to open your account, press enter to after put the amount of the money on your account.")
                account = ATMaccount(
                    isOpen = if (readln() == "Open") {
                        true
                    } else {
                        throw IllegalStateException()
                    }, money = readln().toInt()
                )
            }
            println("Write the amount what you want to withdraw of your account.")
            val moneyInputted = readln().toInt()
            account.withdraw(
                amount = if (moneyInputted < 0) {
                    throw NumberFormatException()
                } else {
                    moneyInputted
                }
            )
            println("The restant money on you account is: ")
            println(account.availableMoney)
            canExecuteTheExitOfSystem = true

        } catch (_: NumberFormatException) {
            println("This isnt a valid number to withdraw.")
        } catch (_: IllegalStateException) {
            println("Your account is not opened, you cant progress.")
        } catch (_: NumberFormatException) {
            println("Your money is not a number.")
        }
        if (canExecuteTheExitOfSystem) {
            println("If you want to leave, write 'Leave', if it are not your case and you want to continue withdraw money of your account, only press enter or other character/text/number.")
            exitOfSystem = readln()
        }
        canExecuteTheExitOfSystem = false
    } while (exitOfSystem != "Leave")
    println("Thanks you for uses our program, see you later.")
}
