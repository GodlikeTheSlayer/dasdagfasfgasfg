// import required libraries
import java.util.*

// main function
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // take input
    val n = scanner.nextInt()

    //  initialize the first two integers of the Fibonacci series to 0 and 1 respectively
    var t1 = 0
    var t2 = 1
    var t3 = 0
    var counter = 2
    var result = "0, 1, "
    while (counter < n) {
        t3 = t1 + t2
        result += "$t3, "
        t1 = t2
        t2 = t3
        counter++
    }
    result = result.removeRange(result.length-2..result.length-1)
    println(result)
    // Write your "while" loop code here to complete the series

    // print the series
}