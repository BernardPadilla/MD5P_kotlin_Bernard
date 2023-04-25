import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter name: ")
    val name = scanner.nextLine()

    print("Enter grade in Physics: ")
    val physicsGrade = scanner.nextDouble()

    print("Enter grade in Algebra: ")
    val algebraGrade = scanner.nextDouble()

    print("Enter grade in Programming: ")
    val programmingGrade = scanner.nextDouble()

    val averageGrade = (physicsGrade + algebraGrade + programmingGrade) / 3

    println("$name average grade is %.2f".format(averageGrade))

    val gradeStatus = when (averageGrade) {
        in 95.0..100.0 -> "President lister"
        in 89.0..94.99 -> "Dean lister"
        in 83.0..88.99 -> "Average Student"
        in 78.0..82.99 -> "Fair"
        in Double.MIN_VALUE..77.99 -> "Failure"
        else -> "Invalid grade"
    }

    println(gradeStatus)
}
