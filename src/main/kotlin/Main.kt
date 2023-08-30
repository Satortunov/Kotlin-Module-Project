import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var archiveWorks: ArchiveActions = ArchiveActions()
    var notesList : MutableList<Notes> = ArrayList()
    var archiveList : MutableList<Archive> = ArrayList()
    var menuChoice: MenuCreate = MenuCreate()
    var currentArchive: Archive = Archive("", notesList)

    val secondMenuItems: List<Menu> = listOf(
        Menu(0, "Создать заметку", {  }),
        Menu(1, "Удалить заметку", { archiveWorks.deleteNotesItem(notesList) }),
    )

    val firstMenuItems: List<Menu> = listOf(
        Menu(0, "Создать архив", { archiveWorks.createArchieve(archiveList) }),
        Menu(1, "Удалить архив", { archiveWorks.deleteArchieveItem(archiveList) }),
    )

    val mainMenuItems: List<Menu> = listOf(
        Menu(0, "Работа с архивами",  { menuChoice.showMenu(firstMenuItems) } ),
        Menu(1, "Работа с заметками", { menuChoice.showMenu(secondMenuItems)} ),
    )

    val listOfMenu:  List<MenuItem> = listOf(
        MenuItem(0, mainMenuItems),
        MenuItem(1, firstMenuItems),
        MenuItem(2, mainMenuItems)
    )

    var currentMenuItem: MenuItem = listOfMenu[0]
    var prevMenuItem: MenuItem = listOfMenu[0]
    var nwextuItem: MenuItem = listOfMenu[0]

    var currentNum : Int = menuChoice.showMenu(listOfMenu[0].items)
    var prevNum : Int = 0
    var nextNum : Int = 0


    var stopWorkWithMenu: Boolean = true

    while(stopWorkWithMenu){
        listOfMenu[prevNum].items[currentNum].action()
        listOfMenu[prevNum].number
        //prevNum = currentNum
        //currentNum = listOfMenu[currentNum].number

    }







    /*listOfMenu[0][0].action()
    listOfMenu[0][1].action()
    listOfMenu[1][0].action()
    listOfMenu[1][1].action()
    listOfMenu[2][0].action()
    listOfMenu[2][1].action()*/

}



