import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var archiveWorks: ArchiveActions = ArchiveActions()
    var notes: Notes = Notes("", "")
    var notesList : MutableList<Notes> = ArrayList()
    var archiveList : MutableList<Archive> = arrayListOf(Archive("assa", notesList))
    var currentMenu: MenuCreate = MenuCreate()
    var currentArchive: Archive = Archive("", notesList)

    val secondMenuItems: List<Menu> = listOf(
        Menu(1, "Создать заметку", { archiveWorks.createNote(currentArchive) }),
        Menu(2, "Удалить заметку", { archiveWorks.deleteNotesItem(notesList) }),
    )

    val firstMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив", { archiveWorks.createArchieve(archiveList) }),
        Menu(2, "Удалить архив", { archiveWorks.deleteArchieveItem(archiveList) }),
    )

    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Работа с архивами",  { currentMenu.showMenu(firstMenuItems) } ),
        Menu(2, "Работа с заметками", { currentMenu.showMenu(secondMenuItems)} ),
    )

    val listOfMenu:  List<List<Menu>> = listOf(
        mainMenuItems,
        firstMenuItems,
        secondMenuItems,
    )
    println("${listOfMenu[0][0].title}")
    var currentNum : Int = currentMenu.showMenu(mainMenuItems)

    /*listOfMenu[0][0].action()
    listOfMenu[0][1].action()
    listOfMenu[1][0].action()
    listOfMenu[1][1].action()
    listOfMenu[2][0].action()
    listOfMenu[2][1].action()*/

}



