fun main (){
    //Variables
    var name:String
    var year1:Int=0
    var year2:Int=0
    var age: Int=0

    //input
    println("Please Enter your name : ")
    name = readln().toString()
    println("Please Current year : ")
    year1 = readln().toInt()
    println("Please Birth year : ")
    year2 = readln().toInt()


    //Process
    age=year1-year2

    //output
    println("$name your age on $year1 is $age")


}