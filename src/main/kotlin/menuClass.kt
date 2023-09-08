package MenuClass
import java.util.Scanner
import kotlin.reflect.typeOf



/*class MyObject
{
    fun incInt(i: Int, incI: Int) : Int  {return i + incI}
    operator fun invoke(x: Int): Int { return incInt(x, 3) }
}

class RunFunction(val funct(Int) : Int)
{

}*/

class MenuItem(val number: Int, val title: String,  val nextMenuNumber: Int, val action: () -> Unit)
//

{

}

class Menu(val numberOfMenu: Int, val items: List<MenuItem>)
{
    fun showMenu() : Int {
        val scanner = Scanner(System.`in`)
        var menuChoice: String = ""
        var rightChoice: Boolean = false
        while(!rightChoice) {
            for (item in items) {
                println("${item.number} - ${item.title}")
            }
            print("Выберите пункт меню: ")
            menuChoice = scanner.nextLine()
            if ((menuChoice.toIntOrNull() is Int)) {
                if ( (menuChoice.toInt() >= 0) && (menuChoice.toInt() <= items.size - 1)) { rightChoice = true }
                else { println("\nНеправильный ввод. Будьте внимательнее! ") }

            } else {
               println("\nНеправильный ввод. Будьте внимательнее! ")
            }

        }
        return menuChoice.toInt()

    }
}