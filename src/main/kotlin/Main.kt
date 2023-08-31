import MenuClass.*
import WorkWithArchives.*

fun main(args: Array<String>)
{
    val rootMenu: List<MenuItem> = listOf(
        MenuItem(0, "Работа с архивами"), //Показать меню firstMenu
        MenuItem(1, "Работа с заметками" ),//показать список архтвов и предложить выбрать архив из списка, после показать его заметки
        MenuItem(2, "Выход" ), // завершить работу программы
    )
    var currentMenu: Menu = Menu(0, rootMenu)
    var itemChoice: Int = currentMenu.showMenu()

}



