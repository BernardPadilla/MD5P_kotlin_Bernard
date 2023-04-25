fun main() {

    print("Enter a number: ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }
}