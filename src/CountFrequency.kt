import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>){

    val list =  listOf("S","S","Q","D","D","R","R","D","D","Y","U")

    val frequencyMap : MutableMap<String, Int> = HashMap()

    for (i in list)
    {
        var count = frequencyMap[i]

        if (count==null) count= 0
        frequencyMap[i] = count + 1
    }
    println(frequencyMap)

}
