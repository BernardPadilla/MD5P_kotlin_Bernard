fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: return
    for (i in 1..10) {
        val product = number * i
        println("$number x $i = $product")
    }
}
