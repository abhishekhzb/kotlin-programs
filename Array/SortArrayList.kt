fun main() {
    val arrayList = arrayListOf(5, 3, 8, 2, 1)
    println("Original ArrayList: $arrayList")

    bubbleSort(arrayList)
    println("Sorted ArrayList (ascending order): $arrayList")
}

fun bubbleSort(arrayList: ArrayList<Int>) {
    val n = arrayList.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arrayList[j] > arrayList[j + 1]) {
                val temp = arrayList[j]
                arrayList[j] = arrayList[j + 1]
                arrayList[j + 1] = temp
            }
        }
    }
}
