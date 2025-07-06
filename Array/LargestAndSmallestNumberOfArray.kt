fun main() {
    val list = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    println("Largest: ${largestNumber(list)}")
    println("Smallest: ${smallestNumber(list)}")
}

fun largestNumber(list: Array<Int>): Int {
    var max = list[0]

    for (num in list) {
        if (max < num) {
            max = num
        }
    }

    return max
}

fun smallestNumber(list: Array<Int>): Int {
    var min = list[0]

    for (num in list) {
        if (min > num) {
            min = num
        }
    }

    return min
}
