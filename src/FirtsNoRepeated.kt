import java.util.*
import kotlin.collections.HashMap

private fun firstNo(s : String) :Char? {

    val firstHashMap:HashMap<Char, Int> = HashMap()
    var c : Char

    for(i in s.indices){
        c= s[i]
        if (firstHashMap.containsKey(c)){
            firstHashMap[c]=firstHashMap[c]!!+1
        } else
        {
            firstHashMap[c] = 1
        }
    }

    for(i in s.indices){
        c = s[i]
        if (firstHashMap[c]==1)
            return c
    }
    return null
}

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)
    println("Enter value:")

    val str: String = scanner.nextLine()
    val d = firstNo(str)
    if (d!= null){
        println("The first No-Repeated Char is $d")
    }
    else{
        println("Not exist")
    }

}
