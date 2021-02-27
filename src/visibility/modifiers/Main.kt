package visibility.modifiers

fun main() {
    val c = sum(4,5)
//    val d = difference(8,9)// only available in Function.kt because it is private
    val e = deviation(8,5)

   /* val product : Product = Product()
    product.product()*/

}

class Product{
    protected fun product(a:Int,b:Int):Int = a * b
}