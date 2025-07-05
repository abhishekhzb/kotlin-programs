fun main() {
    val s1 = "silent"
    val s2 = "listen"

    if (areAnagrams(s1, s2)) {
        println("Anagram")
    } else {
        println("Not Anagram")
    }
}

fun areAnagrams(s1: String, s2: String): Boolean {
    if (s1.length != s2.length) {
        return false
    }

    val sorted1 = s1.toCharArray().sorted()
    val sorted2 = s2.toCharArray().sorted()

    return sorted1 == sorted2
}
