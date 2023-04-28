fun main() {
    val phoneBook = mapOf(
        "Alice" to "555-1234",
        "Bob" to "555-5678",
        "Charlie" to "555-9101"
    )

    print("What is the name? ")
    val name = readLine()!!

    if (phoneBook.containsKey(name)) {
        val phoneNumber = phoneBook[name]
        println("$name's phone number is $phoneNumber.")
    } else {
        println("Sorry, $name is not in the phone book.")
    }
}
