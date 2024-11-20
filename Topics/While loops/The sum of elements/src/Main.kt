import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (number != 0) {
            sum += number
        } else {
            break
        }

    }
    println(sum)
}