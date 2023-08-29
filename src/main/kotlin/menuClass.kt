package MenuClass


class Menu(val number: Int, val title: String, val action: (Any) -> Any)
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
  while (exitCode) {

   for (item in menuItems) {
    println("${item.number} - ${item.title}")
   }
   println("${menuItems.size + 1} - Выход")


   print("Введите номер элемента меню: ")
   menuItemNumber = readLine()
   var rightEntry: Boolean = false
   for (item in menuItems) {
    if (menuItemNumber == item.number.toString()) {
     rightEntry = true
    }
    if (menuItemNumber == (item.number + 1).toString()) {
     rightEntry = true
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