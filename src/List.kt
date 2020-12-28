import java.util.function.Consumer

fun main() {
    println("Immutable list example")
    val fruits = listOf("Apple","Orange","Banana","Pineapple")
    //fruits[0] = "Grape" // this is not support because this list is immutable
    println("First element: ${fruits[0]}")
    print("[")
    for (fruit in fruits)
        print(" $fruit ")
    print("]")
    println("\n")

    println("Mutable list example")
    val names = mutableListOf<String>("Souma","Arijit","Soumik")
    names.add("Sumit")
    names[0] = "Soumadip" // in this example you can update the list because this list is mutable
    println("First element: ${names[0]}")
    print("[")
    for (name in names)
        print(" $name ")
    print("]")
    println()

    // names iterate using foreach
    names.forEach(Consumer { name -> print("$name  ") })
    println()
    fruits.forEach { print("$it  ") }

}