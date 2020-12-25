fun main() {
    val names = arrayOf("Souma","Arijit","Soumik")

    // for loop
    println("Print array element using for loop")
    for ( name in names)
        println(name)

    // for loop
    println("Print array element using for each loop")
    names.forEach { name -> println(name) }
}