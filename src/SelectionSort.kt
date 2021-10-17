

fun selectionSorts(arrayInput: IntArray){
    val n= arrayInput.size
    var temp: Int

    for (i in 0 until n)
    {
        var indexOfMin = i
        for(j in n-1 downTo i)
        {
            if(arrayInput[j]<arrayInput[indexOfMin])
                indexOfMin = j
        }
        if (i != indexOfMin){
            temp = arrayInput[i]
            arrayInput[i]=arrayInput[indexOfMin]
            arrayInput[indexOfMin] = temp
        }

    }

}
fun main(arg: Array<String>){
    println("List to Sort")
    val valuesData = intArrayOf(1, 2, 5, 4, 5, 6, 82, 5689, 33)
    for(i in valuesData) print(" $i")

    selectionSorts(valuesData)
    println(" sorted Array is :")
    for(i in valuesData) print(" $i")

}