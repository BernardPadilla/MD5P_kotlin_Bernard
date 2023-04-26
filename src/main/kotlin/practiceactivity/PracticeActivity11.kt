fun main () {
    //activity 11
    var grade: Int = 0


    //Input
    println("Enter name:")
    var name = readln()
    println("Enter grade in Physics:")
    var gradePhs = readln().toDouble()
    println("Enter grade in Algebra:")
    var gradeAlgebra = readln().toDouble()
    println("Enter grade in Programming:")
    var gradeProg = readln().toDouble()

    //Process

    var averageGrade= (gradeAlgebra+gradePhs+gradeProg)/3

    if (averageGrade<=100){
        println("$name average grade is $averageGrade")
        println("President Lister")
    }else if (averageGrade<=94){
        println("$name average grade is $averageGrade")
        println("Dean Lister")

    }else if (averageGrade<=88){
        println("$name average grade is $averageGrade")
        println("Average Student")
    }else if (averageGrade<=82){
        println("$name average grade is $averageGrade")
        println("Fair")
    }else if (averageGrade<78){
        println("$name average grade is $averageGrade")
        println("Failure")

    }else {
        println("$name average grade is $averageGrade")
        println("Invalid Grade")
    }







}
