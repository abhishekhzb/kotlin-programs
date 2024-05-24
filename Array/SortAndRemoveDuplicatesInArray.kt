fun main(args: Array<String>) {
    val array = intArrayOf(5,3,8,2,1,6,8,9,5,3,2)
    val sortedArray = sortArrayValues(array)
}

fun sortArrayValues(array : IntArray){
  val n = array.size
  
  for(i in 0 until n-1){
    for(j in 0 until n-i-1){
      if(array[j]> array[j+1]){
        val temp = array[j]
        array[j] = array[j+1]
        array[j+1] = temp
      }
    }
  }
  
  val hashset = HashSet<Int>()
  for(i in array){
     hashset.add(i)
  }
  println(hashset)  
}
