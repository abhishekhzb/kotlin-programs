fun main() {
   val str = "Hello"
   val revStr = reverseString(str)
   println(revStr)
}

fun reverseString(str :String):String{
    var revStr = ""
    
    for(i in str.length - 1 downTo 0){
        revStr += str[i]
    }

    return revStr
}
