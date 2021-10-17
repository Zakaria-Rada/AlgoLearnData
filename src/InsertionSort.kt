
fun <T:Comparable<T>> insertionSort(items:MutableList<T>):List<T>{
    if (items.isEmpty()){
        return items
    }
    for (count in 1 until items.count()){
        val item = items[count]
        var i = count
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}


fun main(args: Array<String>) {
    val names = mutableListOf("John", "Tim", "Zack", "Daniel", "Adam")
    println(names)
    val ordered = insertionSort(names)
    println(ordered)
}