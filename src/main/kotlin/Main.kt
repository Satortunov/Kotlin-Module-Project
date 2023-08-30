import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var archiveWorks: ArchiveActions = ArchiveActions()
    var notesList : MutableList<Notes> = ArrayList()
    var archiveList : MutableList<Archive> = arrayListOf(Archive("assa", notesList))
    var currentMenu: MenuCreate = MenuCreate()
    var currentArchive: Archive = Archive("", notesList)

    val secondMenuItems: List<Menu> = listOf(
        Menu(0, "Создать заметку", { archiveWorks.createNote(currentArchive) }),
        Menu(1, "Удалить заметку", { archiveWorks.deleteNotesItem(notesList) }),
    )

    val firstMenuItems: List<Menu> = listOf(
        Menu(0, "Создать архив", { archiveWorks.createArchieve(archiveList) }),
        Menu(1, "Удалить архив", { archiveWorks.deleteArchieveItem(archiveList) }),
    )

    val mainMenuItems: List<Menu> = listOf(
        Menu(0, "Работа с архивами",  { currentMenu.showMenu(firstMenuItems) } ),
        Menu(1, "Работа с заметками", { currentMenu.showMenu(secondMenuItems)} ),
    )

    val listOfMenu:  List<List<Menu>> = listOf(
        mainMenuItems,
        firstMenuItems,
        secondMenuItems,
    )

    var currentNum : Int = currentMenu.showMenu(mainMenuItems)




    /*listOfMenu[0][0].action()
    listOfMenu[0][1].action()
    listOfMenu[1][0].action()
    listOfMenu[1][1].action()
    listOfMenu[2][0].action()
    listOfMenu[2][1].action()*/

}



