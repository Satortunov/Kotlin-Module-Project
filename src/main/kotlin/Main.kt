import MenuClass.*

fun main(args: Array<String>)
{
    val mainMenuItems: List<Menu> = listOf(
        Menu(1, "Создать архив"),
        Menu(2, "Созданные архивы"),
    )

    var mainMenu = MenuCreate(mainMenuItems)
    var i: Int = mainMenu.showMenu(mainMenuItems)


}