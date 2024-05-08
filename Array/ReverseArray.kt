fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Original Array: ${array.joinToString()}")

    reverseArray(array)
    println("Reversed Array: ${array.joinToString()}")
}

fun reverseArray(array: IntArray) {
    var start = 0
    var end = array.size - 1

    while (start < end) {
        val temp = array[start]
        array[start] = array[end]
        array[end] = temp
        start++
        end--
    }
}
