fun main() {
    val names = arrayOf("Souma","Arijit","Soumik")

    // for loop
    println("Print array element using for loop")
    for ( name in names)
        println(name)

    // for loop
    println("Print array element using for each loop")
    names.forEach { name -> println(name) }

    // while loop
    println("Print array element using for each while loop")
    var index: Int = 0
    while (index < names.size)
        println(names[index++])
}