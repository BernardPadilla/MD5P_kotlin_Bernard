fun main(){
    //Program description
    //this is a program that can register a student profile
    //and computes grades
    var selection:Int=0
    println("Please Enter Selection")
    println("[1] Register Student")
    println("[2] Computes Grades")
    selection = readln().toInt()

    when(selection){
        1-> {
            println("Student Registration!")
            println("Enter Your Name")
            var name:String = readln()
            println("Enter your Course:")
            var course:String = readln()

            println("Do you want to register your $name with course $course")
            var response:String = readln()

            if (response=="yes"||response=="Yes"){
                println("Registered Successfully!")
            }else{
                println("registration Failed!")
            }
        }
        //computes grades
        2 -> {
            println("Student Grade Computation")
            println("Enter Grade1:")
            var grade1:Int = readln().toInt()
            println("Enter Grade2:")
            var grade2:Int = readln().toInt()
            println("Enter Grade3:")
            var grade3:Int = readln().toInt()

            var gradeAverage = (grade1+grade2+grade3)/3

            println("Average is $gradeAverage")
            if (gradeAverage>74){
                println("Passed")
            }else{
                println("Failed")
            }

        }
        else ->{
            println("Invalid input")
        }
    }





}