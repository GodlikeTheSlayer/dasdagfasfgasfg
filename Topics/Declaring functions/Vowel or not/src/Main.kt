// write your function here

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char):Boolean {
    val vowel = "aeiou"
    for (l in vowel) {
        if (l == letter.lowercaseChar()) {
            return true
        }
    }
    return false
}