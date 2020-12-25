fun printGrade(marks : Int){
    if (marks > 90 && marks <= 100)
        println("AA")
    else if(marks > 80)
        println("A+")
    else if (marks > 70)
        println("A")
    else if(marks > 60)
        println("B+")
    else if (marks > 50)
        print("B")
    else if (marks > 40)
        println("C")
    else if (marks >= 30)
        println("D")
    else
        println("Fail")

}

fun main() {
    printGrade(41)
}