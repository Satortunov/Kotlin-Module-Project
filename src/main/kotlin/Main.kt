import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    var archiveWorks: ArchiveActions = ArchiveActions()
    var arciveList : MutableList<Archive> = null
    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Работа с архивами",  {archiveWorks.createArchieve(arciveList)} ),
        Menu(2, "Работа с заметками", {1} ),
    )
    var currentMenu: MenuCreate = MenuCreate()
    var menuItem: Menu = Menu(1,"Работа с архивами",  {currentMenu.showMenu(mainMenuItems)} )
    var currentItem: Int = menuItem.action((mainMenuItems))
    println(currentItem)

}



