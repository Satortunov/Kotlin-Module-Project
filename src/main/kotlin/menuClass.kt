package MenuClass


data class Menu(val number: Int, val title: String,)

class MenuCreate
 (
    val menuItems:  List<Menu> = ArrayList()
)

{
    fun actionTodo(input: String)
    {
        println(input)
    }
    fun showMenu(menuTitle : String, menuItems : List<Menu>) : Int
    {
        var exitCode: Boolean = true
        var menuNumber: String? = "0"
        println(menuTitle)
        while (exitCode) {

            for (item in menuItems) {
                println("${item.number} - ${item.title}")
            }
            println("${menuItems.size + 1} - Выход")


            print("Введите номер элемента меню: ")
            menuNumber = readLine()
            var rightEntry: Boolean = false
            for (item in menuItems) {
                if (menuNumber == item.number.toString()) {
                    rightEntry = true
                }
                if (menuNumber == (item.number + 1).toString()) {
                    rightEntry = true
                }
            }
            if (rightEntry == true) {
                exitCode = false
                /*if (menuNumber == (menuItems.size + 1).toString()) {

                    exitCode = false
                }*/
            } else {
                println("Вы ввели неправильное значение")
            }
        }
        return menuNumber.toString().toInt()
    }

 }