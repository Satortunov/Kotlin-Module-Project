package MenuClass
import Utils.*

class MenuItem(val number: Int, val title: String,  val nextMenuNumber: Int, val action: () -> Unit)

{

}

class Menu(val numberOfMenu: Int, val items: List<MenuItem>)
{
    fun showMenu() : Int {
        for (item in items) {
            println("${item.number} - ${item.title}")
        }
        return checkIntEntrty("Выберите пункт меню: ", items.size)
    }
}
