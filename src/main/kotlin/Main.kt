import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var arciveList:  MutableList<Archive> = ArrayList()
    var newArchive: ArchiveActions = ArchiveActions()

    for (i in 0..5) {
        newArchive.createArchieve(arciveList)
    }
    newArchive.showArchieve(arciveList)
    newArchive.deleteArchieveItem(arciveList)
    newArchive.showArchieve(arciveList)




   /* val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив", { println("One") } ),
        Menu(2, "Созданные архивы", { println("Two") })
    )
    val firstMenuItems: List<Menu> = listOf(
        Menu(1, "Создание нового архива"),
     )
    val secondMenuItems: List<Menu> = listOf(
        Menu(1, "Работа с имеющимися архивами"),
    )
    val listOfMenu:  List<List<Menu>> = listOf(
        mainMenuItems,
        /*firstMenuItems,
        secondMenuItems,*/
    )
    var currentMenu = MenuCreate(listOfMenu[0])
    var i: Int = 0
    var showMenu: Boolean = true
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