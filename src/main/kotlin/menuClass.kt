package MenuClass


data class Menu(val number: Int, val title: String)

class MenuCreate
 (
    val menuItems:  List<Menu> = ArrayList()
)

{
    fun showMenu(menuItems : List<Menu>) : Int
     {
         for(item in menuItems)
         {
            println("${item.number} - ${item.title}")
         }
       println("${menuItems.size + 1} - Выход")
       return menuItems.size
     }
 }