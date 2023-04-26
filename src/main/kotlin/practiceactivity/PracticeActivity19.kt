fun main() {
    print("Enter a positive integer: ")
    var n = readln().toInt()

    var factorial = 1
    var i = 1

    do {
        factorial *= i
        i++
    } while (i <= n)

    println("The factorial of $n is $factorial.")
}
