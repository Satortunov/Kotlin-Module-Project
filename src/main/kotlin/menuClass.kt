package MenuClass
import java.util.Scanner
import kotlin.reflect.typeOf

class MenuItem(val number: Int, val title: String)
/*, val action: () -> Unit*/
{

}

class Menu(val numberOfMenu: Int, val items: List<MenuItem>)
{
    fun showMenu() : Int {
        val scanner = Scanner(System.`in`)
        var menuChoice: String = 0
        var rightChoice: Boolean = false
        while(!rightChoice) {
            for (item in items) {
                println("${item.number} - ${item.title}")
            }
           if ((menuChoice.toIntOrNull() is Int)) {
                if ( (menuChoice.toInt() >= 0) && (menuChoice.toInt() <= items.size)) { rightChoice = true }
            } else {
                println(menuChoice)
                println("Повторите ввод")
            }
        }
        return menuChoice.toInt()

    }
}