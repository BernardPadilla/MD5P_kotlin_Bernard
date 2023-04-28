fun main() {
    print("Enter a string: ")
    val input = readLine()?.toLowerCase()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    for (char in input ?: "") {
        if (char in vowels) {
            count++
        }
    }
    println("The number of vowels in the string is: $count")
}
