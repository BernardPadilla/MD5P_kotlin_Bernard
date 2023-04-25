fun main() {
    var num:Int = 0

    //Input
    print("Enter a number: ")
    num = readln().toInt()

    //Process/Output
    if (num > 0) {
        println("The number is positive.")
    } else if (num < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }
}