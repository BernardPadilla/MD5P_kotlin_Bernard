fun main() {
    print("Enter a year: ")
    var year = readln().toInt()

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}
