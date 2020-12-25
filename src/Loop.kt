fun main() {
    val names = arrayOf("Souma","Arijit","Soumik")

    // for loop
    println("Print array element using for loop")
    for ( name in names)
        println(name)
    // another way
    println("Print array element using for loop(using range)")
    for ( i in 0 until names.size)
        println(names[i])

    // for each loop
    println("Print array element using for each loop")
    names.forEach { name -> println(name) }

    // another way
    println("Print array element using for each loop(Another way)")
    names.forEach { println(it) } // it take element one by one

    // while loop
    println("Print array element using for each while loop")
    var index: Int = 0
    while (index < names.size)
        println(names[index++])
}