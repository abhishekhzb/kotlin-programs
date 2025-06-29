fun main() {
    val arr = arrayOf(1,2,3,4,5)
    println(reverseArray(arr).joinToString())
}

fun reverseArray(arr: Array<Int>): Array<Int>{
    val revArray = Array(arr.size){0}
    var j = 0
    for(i in arr.size-1 downTo 0){
        revArray[j] = arr[i]
        j++
    }
    
    return revArray
}
