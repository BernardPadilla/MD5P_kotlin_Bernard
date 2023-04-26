fun main() {
    print("Enter number 1: ")
    var num1 = readln().toDouble()

    print("Enter number 2: ")
    var num2 = readln().toDouble()

    print("Enter number 3: ")
    var num3 = readln().toDouble()

    var smallest = if (num1 <= num2 && num1 <= num3) {
        num1
    } else if (num2 <= num1 && num2 <= num3) {
        num2
    } else {
        num3
    }

    println("The smallest number is $smallest")
}
