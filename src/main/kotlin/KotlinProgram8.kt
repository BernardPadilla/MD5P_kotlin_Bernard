fun main(){
    //  declare all variables
    var number1:Int =0
    var number2:Int =0
    var sum:Int =0
    var difference: Int =0
    var product: Int = 0
    var qoutient: Int = 0
    var modulo: Int = 0

    //input
    println("enter 1st Number :")
    number1 = readln().toInt()
    println("eneter 2nd number :")
    number2 = readln().toInt()

    //Process
    sum= number1+number2
    difference = number1-number2
    product = number1*number2
    qoutient=number1/number2
    modulo=number1%number2

    //output
    println("the sum is : $sum")
    println("the difference : $difference")
    println("the Product is : $product")
    println("the quotient is : $qoutient")
    println("the modulo is : $modulo")



}