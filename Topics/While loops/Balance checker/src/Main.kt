import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var str = ""
    while (scanner.hasNextInt()) {
        val purchase = scanner.nextInt()
        if (purchase <= balance) {
            balance -= purchase
            str = "Thank you for choosing us to manage your account! Your balance is $balance."
        } else {
            str = "Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase."
        }
    }
    println(str)

}