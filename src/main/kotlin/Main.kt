import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var currentMenu: Menu = Menu(0, ArrayList<MenuItem>())
    var itemChoice: Int = 0

    val rootMenu: List<MenuItem> = listOf(
        MenuItem(0, "Работа с архивами", {currentMenu.showMenu()}), //Показать меню firstMenu
        MenuItem(1, "Работа с заметками",{currentMenu.showMenu()} ),//показать список архтвов и предложить выбрать архив из списка, после показать его заметки
        MenuItem(2, "Выход", {currentMenu.showMenu()}), // завершить работу программы
    )

    val firstMenu: List<MenuItem> = listOf(
        MenuItem(0, "Добавить архив в список", {currentMenu.showMenu()}), // добавление архива
        MenuItem(1, "Удалить архив из списка", {currentMenu.showMenu()}), // удалить архив, показать списко архивоа и меню thirdMenu
        MenuItem(2, "Выбрать архив из списка", {currentMenu.showMenu()} ), // показать списко архивоа и меню thirdMenu
        MenuItem(3, "Выход", {currentMenu.showMenu()} ), //Перейти в rootMenu
    )
         val secondtMenu: List<MenuItem> = listOf(
         MenuItem(0, "Добавить заметку в список", {currentMenu.showMenu()}), //Добавление заметки в список
         MenuItem(1, "Удалить заметку из списка", {currentMenu.showMenu()} ), // Удалить заметку из списка, вызывать fourthdMenu
         MenuItem(2, "Выход", {currentMenu.showMenu()} ), //удаление заметки из списк
     )

    val listOfMenu:  List<Menu> = listOf(
        Menu(0, rootMenu),
        Menu(1, firstMenu),
        Menu(2, secondtMenu),
    )

    var currentIndex: Int = 0
    var prevIndex: Int = 0
    var nextIndex: Int = 0

    currentMenu = Menu(0, listOfMenu[currentIndex].items)
    var showContent: Boolean = true


    while (showContent) {
        itemChoice = currentMenu.showMenu()
        if (itemChoice == currentMenu.items.size - 1) {
            if (currentIndex == 0) { showContent = false}
            else { currentIndex = prevIndex}

        } else {
            nextIndex = listOfMenu[currentIndex].items[itemChoice].number
            currentMenu = listOfMenu[nextIndex]
            currentIndex = nextIndex
        }
    }

}






