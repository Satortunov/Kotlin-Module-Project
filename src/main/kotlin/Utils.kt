package Utils
import java.util.Scanner

fun checkIntEntrty(entryMessage: String, sizeOfArray : Int) : Int {
    val scanner = Scanner(System.`in`)
    var userChoice: String = ""
    var rightChoice: Boolean = false
    while(!rightChoice) {
        print(entryMessage)
        userChoice = scanner.nextLine()
        if ((userChoice.toIntOrNull() is Int)) {
            if ( (userChoice.toInt() >= 0) && (userChoice.toInt() <= sizeOfArray)) { rightChoice = true }
            else { println("\nНеправильный ввод. Будьте внимательнее! ") }

        } else {
            println("\nНеправильный ввод. Будьте внимательнее! ")
        }

    }
    return userChoice.toInt()

}