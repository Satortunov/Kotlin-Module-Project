package MenuClass


data class Menu(val number: Int, val title: String)

class MenuCreate
 (
    val menuItems:  List<Menu> = ArrayList()
)

{
    fun showMenu(menuItems : List<Menu>) : Int
    {
        var exitCode: Boolean = true
        var menuNumber: String? = "0"
        while (exitCode) {

            for (item in menuItems) {
                println("${item.number} - ${item.title}")
            }
            println("${menuItems.size + 1} - Выход")

            print("Введите номер элемента меню: ")
            menuNumber = readLine()

            if (menuNumber == (menuItems.size + 1).toString()) {

                exitCode = false
            }
        }
        return menuItems.size
    }

 }