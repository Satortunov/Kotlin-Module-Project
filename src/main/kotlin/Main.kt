import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>) {

    var currentMenu: Menu = Menu(0, ArrayList<MenuItem>())
    var itemChoice: Int = 0
    var archiveList : MutableList<Archive> = arrayListOf()
    var currentIndex: Int = 0
    var archiveNum: Int = -1

    val rootMenu: List<MenuItem> = listOf(
        MenuItem(0,"Работа с архивами",1,{ println("\n === Меню работы с архивами ===") }), //Показать меню firstMenu
        MenuItem(1, "Выход", -1, { println("\nВыход из программы") }), // завершить работу программы
    )

    val firstMenu: List<MenuItem> = listOf(
        MenuItem(0,"Добавить архив в список",1, { println("\nДобавляю архив в список")
            createArchieve(archiveList)}), // добавление архива
        MenuItem(1,"Удалить архив из списка",1, { println("\nУдаляю архив из списка")
            if (showArchieve(archiveList)) {println("\nУдаляем архив из списка")
                deleteArchieveItem(archiveList)
            } else { println("\nСписок архивов пуст, сначала создайте хотя бы один")
                itemChoice = 0
            }
        }), // удалить архив, показать списко архивоа и меню thirdMenu
        MenuItem(2,"Выбрать архив из списка",2, {
            if (showArchieve(archiveList)) { archiveNum = chooseArchieve(archiveList)}
            else { println("\nСписок архивов пуст, сначала создайте хотя бы один")
                itemChoice = 0
            }
        }), // показать списко архивоа и меню thirdMenu
        MenuItem(3, "Выход", 0, { }), //Перейти в rootMenu
    )
    val secondtMenu: List<MenuItem> = listOf(
        MenuItem(0,"Показать заметки в архиве",2, { println("\nПоказываю заметки в архиве")
            showNotes(archiveList[archiveNum].notes)}),
        MenuItem(1,"Добавить заметку в список",2, { println("\nДобавляю заметку в список")
            createNote(archiveList[archiveNum])
        }), //Добавление заметки в список
        MenuItem(2,"Удалить заметку из списка",2, { println("\nУдаляю заметку из списка")
            deleteNotesItem(archiveList[archiveNum].notes)
        }), // Удалить заметку из списка, вызывать fourthdMenu
        MenuItem(3, "Выход", 1, { }), //Переход к меню архивов
    )

    val listOfMenu: List<Menu> = listOf(
        Menu(0, rootMenu),
        Menu(1, firstMenu),
        Menu(2, secondtMenu),
    )


    var showContent: Boolean = true

    currentMenu = Menu(0, listOfMenu[currentIndex].items)
    println("\n=== Главное меню ===")
    itemChoice = listOfMenu[currentIndex].showMenu()

    while (showContent) {

        if (itemChoice == listOfMenu[currentIndex].items.size - 1) {
            if (listOfMenu[currentIndex].items[itemChoice].nextMenuNumber == -1) {
                showContent = false
            } else {
                currentMenu.items[itemChoice].action()
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






