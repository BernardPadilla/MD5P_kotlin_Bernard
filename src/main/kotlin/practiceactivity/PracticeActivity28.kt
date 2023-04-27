fun main() {
    var choice: String
    do {
        println("Main Menu")
        println("a. Celsius to Fahrenheit")
        println("b. Fahrenheit to Celsius")
        println("c. Exit")
        print("Choose option [a, b, or c]: ")
        choice = readLine()!!.toLowerCase()

        when (choice) {
            "a" -> {
                println("Celsius – Fahrenheit Conversion")
                print("Enter celsius: ")
                val celsius = readLine()!!.toDouble()
                val fahrenheit = 9.0 / 5.0 * celsius + 32.0
                println("Fahrenheit equivalent is $fahrenheit")
            }
            "b" -> {
                println("Fahrenheit - Celsius Conversion")
                print("Enter fahrenheit: ")
                val fahrenheit = readLine()!!.toDouble()
                val celsius = (fahrenheit - 32.0) * 5.0 / 9.0
                println("Celsius equivalent is $celsius")
            }
            "c" -> println("End of program. Good bye!")
            else -> println("Invalid choice. Please choose a, b, or c.")
        }
    } while (choice != "c")
}
