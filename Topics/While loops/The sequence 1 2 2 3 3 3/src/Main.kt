fun main() {
    val input = readln().toInt()
    var counter = 1
    var count = 1
    var str = ""

    for (i in 1..input) {
        while (counter <= i) {
            if (count > input) {
                break
            }
            str += "$i "
            counter++
            count++

        }
        counter = 1
    }
    println(str)
}