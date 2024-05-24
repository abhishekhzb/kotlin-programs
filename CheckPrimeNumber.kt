fun main(args: Array<String>) {
    val input = 13
    val result = checkPrime(input)
    println(result)
}


fun checkPrime(num : Int):Boolean{
  var count = 0
  
  for(i in 1..num ){
    if(num%i==0){
      count++
    }
  }
  
  if(count==2){
    return true
  }else{
    return false
  }
 
}
