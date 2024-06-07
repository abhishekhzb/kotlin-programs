fun groupAnagrams(words: List<String>): List<List<String>> {
    val anagramMap = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        // Sort the characters in the word to use as a key
        val sortedWord = word.toCharArray().sorted().joinToString("")
        // Add the word to the corresponding anagram group
        anagramMap.getOrPut(sortedWord) { mutableListOf() }.add(word)
    }

    // Convert the map values to a list of lists
    return anagramMap.values.toList()
}

fun main() {
    val words = listOf("cat", "mat", "rat", "net", "tat", "eat")
    val groupedAnagrams = groupAnagrams(words)
    println(groupedAnagrams)
}
