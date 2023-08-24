import MenuClass.*

fun main(args: Array<String>)
{
    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив"),
        Menu(2, "Созданные архивы"),
    )
    val firstMenuItems: List<Menu> = listOf(
        Menu(1, "Создание нового архива"),
     )
    val secondMenuItems: List<Menu> = listOf(
        Menu(1, "Работа с имеющимися архивами"),
    )
    val listOfMenu:  List<List<Menu>> = listOf(
        mainMenuItems,
        firstMenuItems,
        secondMenuItems,
    )
      var currentMenu = MenuCreate(listOfMenu[0])
    var i: Int = 0
    var showMenu: Boolean = true
    var choosePoint: Int = 0
    while (showMenu) {
        choosePoint = currentMenu.showMenu( listOfMenu[i],)
        if(choosePoint == (listOfMenu[i].size + 1)) {
            if (i <= 0) {
                showMenu = false
            } else {
                i--
            }
        } else {
            i = choosePoint
        }
        println(i)
        println(choosePoint)
    }

}