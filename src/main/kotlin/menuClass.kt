package MenuClass


class Menu(val number: Int, val title: String, val action: () -> Unit)
{

}

class MenuItem(val number: Int, val items: List<Menu>)
{

}

class MenuCreate
 (
   // val menuItems:  List<Menu> = ArrayList()
)

{
 fun showMenu(menuItems : List<Menu>) : Int
 {
  var exitCode: Boolean = true
  var menuItemNumber: String? = "0"
  var rightEntry: Boolean = false

  while (exitCode) {

   for (item in menuItems) {
    println("${item.number} - ${item.title}")
   }
   println("${menuItems.size} - Выход")

   print("Введите номер элемента меню: ")
   menuItemNumber = readLine()


   if (menuItemNumber.toString().toInt() is Int) {
   for (item in menuItems) {
      if ((menuItemNumber.toString().toInt() == item.number) || (menuItemNumber.toString().toInt() == menuItems.size)) { rightEntry = true }
    }
   }
   if (rightEntry == true) {
    exitCode = false
   } else {
    println("Вы ввели неправильное значение")
   }
  }
  return menuItemNumber.toString().toInt()
 }

 }