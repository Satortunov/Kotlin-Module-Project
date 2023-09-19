import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>) {

    var currentMenu: Menu = Menu(0, ArrayList<MenuItem>())
    var itemChoice: Int = 0

    val rootMenu: List<MenuItem> = listOf(
        MenuItem(
            0,
            "Работа с архивами",
            1,
            { println("Показываю меню для работы с архивами") }), //Показать меню firstMenu
        MenuItem(1, "Выход", -1, {}), // завершить работу программы
    )

    val firstMenu: List<MenuItem> = listOf(
        MenuItem(
            0,
            "Добавить архив в список",
            1,
            { println("Добавляю архив в список") }), // добавление архива
        MenuItem(
            1,
            "Удалить архив из списка",
            1,
            { println("Удаляю архив из списка") }), // удалить архив, показать списко архивоа и меню thirdMenu
        MenuItem(
            2,
            "Выбрать архив из списка",
            2,
            { println("Выбираем архив из списка и переходим к работе с заметиками") }), // показать списко архивоа и меню thirdMenu
        MenuItem(3, "Выход", 0, {}), //Перейти в rootMenu
    )
    val secondtMenu: List<MenuItem> = listOf(
        MenuItem(
            0,
            "Добавить заметку в список",
            2,
            { println("Добавляю заметку в список") }), //Добавление заметки в список
        MenuItem(
            1,
            "Удалить заметку из списка",
            2,
            { println("Удаляю заметку из списка") }), // Удалить заметку из списка, вызывать fourthdMenu
        MenuItem(2, "Выход", 1, {}), //удаление заметки из списк
    )

    val listOfMenu: List<Menu> = listOf(
        Menu(0, rootMenu),
        Menu(1, firstMenu),
        Menu(2, secondtMenu),
    )

    var currentIndex: Int = 0
    var showContent: Boolean = true

    currentMenu = Menu(0, listOfMenu[currentIndex].items)
    itemChoice = listOfMenu[currentIndex].showMenu()

    while (showContent) {

        if (itemChoice == listOfMenu[currentIndex].items.size - 1) {
            if (listOfMenu[currentIndex].items[itemChoice].nextMenuNumber == -1) {
                showContent = false
            } else {
                currentMenu = listOfMenu[listOfMenu[currentIndex].items[itemChoice].nextMenuNumber]
                currentIndex = currentMenu.numberOfMenu
                itemChoice = listOfMenu[currentIndex].showMenu()
            }

        } else {
            currentMenu.items[itemChoice].action()
            currentMenu = listOfMenu[listOfMenu[currentIndex].items[itemChoice].nextMenuNumber]
            currentIndex = currentMenu.numberOfMenu
            itemChoice = listOfMenu[currentIndex].showMenu()


        }
    }
}






