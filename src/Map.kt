fun main() {
    // you can add or remove element from this map because this is a mutable map
    val mutableMap : MutableMap<Int, String> = HashMap<Int,String>()
    mutableMap.put(1,"Soumadip Dey")
    mutableMap.put(2,"Soumik Nandi")
    mutableMap.put(3,"Subhrajit Biswas")
    mutableMap.remove(3)

    println("Mutable map example: ")
    for (key in mutableMap.keys)
        println("$key : ${mutableMap.get(key)}")

    //you can't add or remove element from  this map because this is a immutable map
    println("Immutable map example: ")
    val immutableMap : Map<Int,String> = mapOf(1 to "Souma", 2 to "Sudipta", 3 to "Sourav")
    for (key in immutableMap.keys)
        println("$key : ${immutableMap.get(key)}")



}