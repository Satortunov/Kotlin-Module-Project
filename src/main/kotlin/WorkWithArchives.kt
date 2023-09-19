package WorkWithArchives


class Notes(var notesName: String, var notesText: String)
{

}

class Archive(val archiveName: String, val notes: MutableList<Notes>)
{

}

class ArchiveActions

{
    fun createArchieve(arciveList : MutableList<Archive>)
    {
        print("Введите имя нового архива: ")
        var newArchieveName: String? = readLine()
        var newArchieveNotes: MutableList<Notes> = arrayListOf()
        var newArchieve: Archive = Archive(newArchieveName.toString(), newArchieveNotes)
        arciveList.add(newArchieve)
        println("${newArchieve.archiveName} cоздано!!!!")
    }

    fun showArchieve(arciveList : MutableList<Archive>)
    {
        for (i in 0 ..arciveList.size - 1)
        {
            println("${arciveList.indexOf(arciveList[i])} - ${arciveList[i].archiveName}")
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

    fun createNote(archive: Archive)
    {
        var newNote: Notes = Notes("", "")

        print("Введите название новой заметки: ")
        newNote.notesName = readLine().toString()

        print("Введите текст новой заметки: ")
        newNote.notesText = readLine().toString()
        archive.notes.add(newNote)
        println("${newNote.notesName} cоздана!!!!")
    }

    fun showNotes(notesList : MutableList<Notes>)
    {
        for (i in 0 ..notesList.size - 1)
        {
            print("${notesList.indexOf(notesList[i])} - ${notesList[i].notesName} : ${notesList[i].notesText}")
        }
    }

    fun deleteNotesItem(notesList : MutableList<Notes>)
    {
        print("Введите номер заметки для удаления: ")
        var deleteNotesName: String = readLine().toString()
        if ((deleteNotesName.toInt() <= notesList.size) && (deleteNotesName.toInt() >= 0))
        {
            notesList.removeAt(deleteNotesName.toInt())
        } else {
            println("Вы ввели номер элемента за пределами массива")
        }

    }
}


