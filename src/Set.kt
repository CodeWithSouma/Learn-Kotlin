fun main() {
    //this function takes a integer set and print all element of the set
    fun printAllElement(set: Set<Int>) {
        for(s in set) print("$s ")
        println()
    }

    val setOfInteger = setOf<Int>(1,2,3,4,5) // this is immutable set we can't add or remove element form this set
    printAllElement(setOfInteger)

    val setOfInteger2 = mutableSetOf<Int>(1,2,3,4,5) // this is mutable set we can add or remove element form this set
    setOfInteger2.remove(2)
    setOfInteger2.add(9)
    printAllElement(setOfInteger2)

}