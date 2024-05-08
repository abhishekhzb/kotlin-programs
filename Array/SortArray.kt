fun main() {
    val array = intArrayOf(5, 3, 8, 2, 1)
    println("Original Array: ${array.joinToString()}")

    bubbleSort(array)
    println("Sorted Array: ${array.joinToString()}")
}

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
