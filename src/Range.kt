fun main() {
    val x = 10
    val y = 9
    // check x is present or not
    if (x in 1 .. y+1)
        println("$x is fit in this range")

    //Check if a number is out of range
    val list =  listOf<String>("a","b","c","d")
    if (-1 !in 0..list.lastIndex)
        println("-1 is out of range")

    //Iterating over a range
    for ( x in 1 .. 5)
        print("$x    ")
    println()


}
