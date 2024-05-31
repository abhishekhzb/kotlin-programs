
fun main() {
    val s1 = "listen"
    val s2 = "silent"

    val result = checkAnagram(s1, s2)
    println(result)
}

fun checkAnagram(s1: String, s2: String): Boolean {
    val s1Arr = s1.toCharArray()
    val s2Arr = s2.toCharArray()

    if (s1Arr.size != s2Arr.size) {
        return false
    }

    s1Arr.sort()
    s2Arr.sort()

    return s1Arr.contentEquals(s2Arr)
}

//....................................................................
fun main() {
    val s1 = "listen"
    val s2 = "silent"
    println(areAnagrams(s1, s2))
}

fun areAnagrams(s1: String, s2: String): Boolean {
    return s1.length == s2.length && s1.toCharArray().sorted() == s2.toCharArray().sorted()
}
