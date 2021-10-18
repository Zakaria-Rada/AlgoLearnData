
class OrderedArray<T:Comparable<T>>(list:MutableList<T>){

    var items: MutableList<T>  = this.quickSort(list) as MutableList<T>

    /**
     * Use quickSort algorithm to order elements in array
     */
    private fun quickSort(its:List<T>):List<T>{
        if (its.count() < 1) return  its
        val pivot = its[its.count()/2]
        val equal = its.filter { it == pivot }
        val less = its.filter { it < pivot }
        val greater = its.filter { it > pivot }
        return quickSort(less) + equal + quickSort(greater)
    }

    fun insert(element:T){
        val position = findElementPosition(element)
        this.items.add(position, element)
    }

    /**
     * Use binarySearch algorithm to find the position for the new element in array
     */

    private fun findElementPosition(element:T):Int{
        var rangeStart = 0
        var rangeEnd = this.items.count()
        while (rangeStart < rangeEnd) {
            val midIndex = rangeStart + (rangeEnd - rangeStart)/2
            if (this.items[midIndex] == element) {
                return midIndex
            } else if (this.items[midIndex] < element){
                rangeStart = midIndex + 1
            } else {
                rangeEnd = midIndex
            }
        }
        return rangeStart
    }

    override fun toString():String = this.items.toString()

}



fun main(args: Array<String>) {


    println("\nOriginal list:")
    val names = listOf<String>("Tim", "Steve", "Zack", "Adam", "John", "Peter", "Clark") as MutableList<String>
    println(names)
    println("\nOrdered list:")
    val ordered =  OrderedArray<String>(names)
    println(ordered)

    val n1 = "Paul"
    println("\nAdding ${n1} to the list:")
    ordered.insert(n1)
    println(ordered)

    val n2 = "Demetrius"
    println("\nAdding $n2 to the list:")
    ordered.insert(n2)
    println(ordered)

}