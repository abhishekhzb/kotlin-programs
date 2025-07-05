fun main() {
    val str = "wow"
    val result = checkPalindrome(str)

    if (result) {
        println("Palindrome")
    } else {
        println("Not Palindrome")
    }
}

fun checkPalindrome(str :String): Boolean {
    var revStr = ""
    for (i in str.length - 1 downTo 0) {
        revStr += str[i]
    }

    return str == revStr
}
