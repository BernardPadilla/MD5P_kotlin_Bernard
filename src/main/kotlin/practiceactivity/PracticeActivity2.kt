fun main (){
    //variables
    var length: Double = 0.0
    var width: Double = 0.0
    var area: Double=0.0
    var perimeter: Double=0.0

    //Input
    println("Please Enter Length: ")
    length= readln().toDouble()
    println("Please Enter width: ")
    width= readln().toDouble()

    //Process
    area=length*width
    perimeter=(length+width)*2

    //output
    println("the perimiter is ${String.format("%.2f",perimeter)} meters")
    println("the area is ${String.format("%.2f",area)} meters")


}