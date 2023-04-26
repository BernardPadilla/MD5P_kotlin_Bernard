fun main() {
    print("Enter number 1: ")
    var a = readln().toDouble()

    print("Enter number 2: ")
    var b = readln().toDouble()

    print("Enter number 3: ")
    var c = readln().toDouble()

    if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
        println("These numbers form a Pythagorean triple.")
    } else {
        println("These numbers do not form a Pythagorean triple.")
    }
}
