fun main (){
    //multiple condition
    var defaultUsername:String ="admin"
    var defaultPassword:String ="pass123"

    //login
    println("Enter Username :")
    var username:String = readln()
    println("Enter password")
    var password : String = readln()

    //test if credential is correct
    if((username == defaultUsername) && (password==defaultPassword)){
        println("logged in!")
    }else{
        println("Invalid username or Password")
    }


}