import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{

    var assa: Int = 0
    assa = displayMessage(::morning)
    println(assa)
    assa = displayMessage(::evening)
    println(assa)
}
fun displayMessage(mes: () -> Int): Int {
    var i: Int = mes()
    return i
}
fun morning(){
    println("Good Morning")
    return 1
}
fun evening(){
    println("Good Evening")
    return 2
}






