import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>) {

    var currentMenu: Menu = Menu("",0, ArrayList<MenuItem>())
    var itemChoice: Int = 0
    var archiveList : MutableList<Archive> = arrayListOf()
    var currentIndex: Int = 0
    var archiveNum: Int = -1
    var notesNum = -1

    val rootMenu: List<MenuItem> = listOf(
        MenuItem(0,"Работа с архивами",1,{ }),
        MenuItem(1, "Выход", -1, { }), // завершить работу программы
    )

    val firstMenu: List<MenuItem> = listOf(
        MenuItem(0,"Добавить архив в список",1, { createArchieve(archiveList)}),
        MenuItem(1,"Удалить архив из списка",1, {
            if (showArchieve(archiveList)) {
                deleteArchieveItem(archiveList)
            } else { println("\nСписок архивов пуст, сначала создайте хотя бы один")
                itemChoice = 0
            }
        }),
        MenuItem(2,"Выбрать архив из списка для работы с заметками",2, {
            if (showArchieve(archiveList)) { archiveNum = chooseArchieve(archiveList)}
            else { println("Список архивов пуст, сначала создайте хотя бы один")
                itemChoice = 0
            }
        }),
        MenuItem(3, "Выход", 0, { }),
    )
    val secondtMenu: List<MenuItem> = listOf(
        MenuItem(0,"Добавить заметку в список",2, { createNote(archiveList[archiveNum]) }),
        MenuItem(1,"Удалить заметку из списка",2, {
            if (showNotes(archiveList[archiveNum])) {
                deleteNotesItem(archiveList[archiveNum])
            } else { println("\nСписок заметок пуст, сначала создайте хотя бы один")
                itemChoice = 0
            }
        }),
        MenuItem(2,"Показать заметки в архиве",2, { showNotes(archiveList[archiveNum])}),
        MenuItem(3,"Показать заметку",2, {
            if (showNotes(archiveList[archiveNum])) {
                notesNum = chooseNote(archiveList[archiveNum])
                showNote(archiveList[archiveNum], notesNum)
            } else {
                println("Список заметок пуст, сначала создайте хотя бы одну")
                itemChoice = 0
            }
        }),
        MenuItem(4, "Выход", 1, { }), //Переход к меню архивов

    )

    val listOfMenu: List<Menu> = listOf(
        Menu("=== Главное меню ===",0, rootMenu),
        Menu("=== Меню работы с архивами ===",1, firstMenu),
        Menu("=== Меню работы с заметками ===",2, secondtMenu),
    )


    var showContent: Boolean = true

    currentMenu = Menu(listOfMenu[currentIndex].menuTitle,0, listOfMenu[currentIndex].items)
    itemChoice = listOfMenu[currentIndex].showMenu(listOfMenu[currentIndex].menuTitle)

    while (showContent) {

        if (itemChoice == listOfMenu[currentIndex].items.size - 1) {
            if (listOfMenu[currentIndex].items[itemChoice].nextMenuNumber == -1) {
                showContent = false
            } else {
                currentMenu.items[itemChoice].action()
                currentMenu = listOfMenu[listOfMenu[currentIndex].items[itemChoice].nextMenuNumber]
                currentIndex = currentMenu.numberOfMenu
                itemChoice = listOfMenu[currentIndex].showMenu(listOfMenu[currentIndex].menuTitle)
            }

        } else {
            currentMenu.items[itemChoice].action()
            currentMenu = listOfMenu[listOfMenu[currentIndex].items[itemChoice].nextMenuNumber]
            currentIndex = currentMenu.numberOfMenu
            itemChoice = listOfMenu[currentIndex].showMenu(listOfMenu[currentIndex].menuTitle)


        }
    }
}






