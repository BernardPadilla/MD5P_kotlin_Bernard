fun main() {
    print("Enter a string: ")
    val inputString = readLine()!!
    var reversedString = ""

    for (i in inputString.length - 1 downTo 0) {
        reversedString += inputString[i]
    }

    println("Reversed string: $reversedString")
}
