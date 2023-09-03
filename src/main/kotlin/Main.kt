import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
   // var currentMenu: Menu = Menu(0, ArrayList<MenuItem>())
    var itemChoice: Int = 0

    val rootMenu: List<MenuItem> = listOf(
        MenuItem(0, "Работа с архивами", 1), //Показать меню firstMenu
        MenuItem(1, "Работа с заметками",2),//показать список архтвов и предложить выбрать архив из списка, после показать его заметки
        MenuItem(2, "Выход", -1), // завершить работу программы
    )

    val firstMenu: List<MenuItem> = listOf(
        MenuItem(0, "Добавить архив в список", 0), // добавление архива
        MenuItem(1, "Удалить архив из списка", 0), // удалить архив, показать списко архивоа и меню thirdMenu
        MenuItem(2, "Выбрать архив из списка", 0), // показать списко архивоа и меню thirdMenu
        MenuItem(3, "Выход", 0), //Перейти в rootMenu
    )
         val secondtMenu: List<MenuItem> = listOf(
         MenuItem(0, "Добавить заметку в список", 0), //Добавление заметки в список
         MenuItem(1, "Удалить заметку из списка", 0), // Удалить заметку из списка, вызывать fourthdMenu
         MenuItem(2, "Выход", 0), //удаление заметки из списк
     )

    val listOfMenu:  List<Menu> = listOf(
        Menu(0, rootMenu),
        Menu(1, firstMenu),
        Menu(2, secondtMenu),
    )

    var currentIndex: Int = 0
    var prevIndex: Int = 0
    var nextIndex: Int = 0
    var showContent: Boolean = true

    //currentMenu = Menu(0, listOfMenu[currentIndex].items)
    itemChoice = listOfMenu[currentIndex].showMenu()

    while (showContent) {

        if (itemChoice == listOfMenu[currentIndex].items.size - 1) {
            if (listOfMenu[currentIndex].items[itemChoice].nextMenuNumber == -1) { showContent = false }
            else {
                currentIndex = prevIndex
                //currentMenu = listOfMenu[currentIndex]
                itemChoice = listOfMenu[currentIndex].showMenu()
            }

        } else {
            nextIndex = listOfMenu[currentIndex].items[itemChoice].nextMenuNumber
            //currentMenu = listOfMenu[nextIndex]
            currentIndex = nextIndex
            itemChoice = listOfMenu[currentIndex].showMenu()
        }
    }

}






