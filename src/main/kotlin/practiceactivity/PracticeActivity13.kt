fun main() {

    var weight:Double=0.0
    var height:Double=0.0

    print("Enter weight (in kilograms): ")
    weight = readln().toDouble()

    print("Enter height (in meters): ")
    height = readln().toDouble()

    var bmi = weight / (height * height)

    println("Your BMI is $bmi")

    when {
        bmi < 18.5 -> println("You are underweight")
        bmi < 25.0 -> println("You have a normal weight")
        bmi < 30.0 -> println("You are overweight")
        else -> println("You are obese")
    }
}
