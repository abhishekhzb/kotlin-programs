fun main() {
    val input = "HELLO"
    println(reverseString(input))
}

fun reverseString(str:String):String{
    var revString = ""

    for(i in str.length-1 downTo 0){
        revString = revString + str[i]     // O L L E H
    }
    
    return revString
}
