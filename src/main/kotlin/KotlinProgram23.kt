fun main(){
    //arrayList
    var name =ArrayList<String>()
    println("Enter Name 1:")
    name.add(readln())
    println("Enter Name 2:")
    name.add(readln())
    println("Eneter Name 3:")
    name.add(readln())

    var ctr:Int =0
    while (ctr <name.size){
        println(name[ctr])
        ctr++
    }
}