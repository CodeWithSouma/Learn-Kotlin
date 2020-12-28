/*class Person(name:String){ // this a class
    // you can initialize like this
    val name : String = name

    // another method for initialize
    *//*init {
        this.name = name // initialize the name variable
    }*//*

}*/

// simplify above person class
class  Person(val name:String)// name is a property of person class


fun main() {
    val person1 = Person("Soumadip Dey") // object of person
    println(person1.name)
}