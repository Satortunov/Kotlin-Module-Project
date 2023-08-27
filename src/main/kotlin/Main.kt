import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var newArchive:  = ArchiveActions()
    var arciveList:  MutableList<Archive> = ArrayList()
    var showMenu: Boolean = true

    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив", { newArchive.createArchieve(arciveList) } ),
        Menu(2, "Созданные архивы", { newArchive.showArchieve(arciveList) })
    )
    val listOfMenu:  List<List<Menu>> = listOf(
        mainMenuItems,
/*        firstMenuItems,
        secondMenuItems,*/
    )

    while (showMenu){

    }
    /*


    var notesList:  MutableList<Notes> = ArrayList()

    for (i in 0..3) {
        newArchive.createArchieve(arciveList)
    }
    for (i in 0..2) {
        newArchive.createNote(arciveList[1])
    }
    newArchive.showArchieve(arciveList)
    for (i in 0 .. arciveList.size - 1){
        for (j in 0..arciveList[i].notes.size - 1) {
            println("${arciveList[i].notes[j].notesName}: ${arciveList[i].notes[j].notesText}")
        }
    }
    newArchive.deleteArchieveItem(arciveList)
    newArchive.showArchieve(arciveList)

    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив", { println("One") } ),
        Menu(2, "Созданные архивы", { println("Two") })
    )
    val firstMenuItems: List<Menu> = listOf(
        Menu(1, "Создание нового архива"),
     )
    val secondMenuItems: List<Menu> = listOf(
        Menu(1, "Работа с имеющимися архивами"),
    )
    var currentMenu = MenuCreate(listOfMenu[0])
    var i: Int = 0

    var choosePoint: Int = 0
    var currentMenuNum: Int = 0


    while (showMenu) {
        choosePoint = currentMenu.showMenu( listOfMenu[i],)
        if(choosePoint == (listOfMenu[i].size + 1)) {
            if (i <= 0) {
                showMenu = false
            } else {
                i -= currentMenuNum
                currentMenuNum--
            }
        } else {
            i = choosePoint
        }
        println(i)
        println(choosePoint)
    }*/
}