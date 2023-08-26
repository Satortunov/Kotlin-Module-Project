package WorkWithArchives

import MenuClass.Menu

class Archive(val archiveName: String, val notes: MutableList<String>)
{

}

class ArchiveActions

{
    fun createArchieve(arciveList : MutableList<Archive>)
    {
        print("Введите имя нового архива: ")
        var newArchieveName: String? = readLine()
        var newArchieveNotes: MutableList<String> = arrayListOf()
        var newArchieve: Archive = Archive(newArchieveName.toString(), newArchieveNotes)
        arciveList.add(newArchieve)
        println("${newArchieve.archiveName} cоздано!!!!")
    }
    fun showArchieve(arciveList : MutableList<Archive>)
    {
        for (archive in arciveList)
        {
            println("${arciveList.indexOf(archive)} - ${archive.archiveName}")
        }
    }
    fun deleteArchieveItem(arciveList : MutableList<Archive>)
    {
        print("Введите номер архива для удаления: ")
        var deleteArchiveName: String = readLine().toString()
        if ((deleteArchiveName.toInt() <= arciveList.size) && (deleteArchiveName.toInt() >= 0))
        {
            arciveList.removeAt(deleteArchiveName.toInt())
        } else {
            println("Вы ввели номер элемента за пределами массива")
        }

    }


}

