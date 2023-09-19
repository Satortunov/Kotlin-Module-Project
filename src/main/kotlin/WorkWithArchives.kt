package WorkWithArchives

import java.util.Scanner
import Utils.*

class Notes(var notesName: String, var notesText: String)
{

}

class Archive(val archiveName: String, val notes: MutableList<Notes>)
{

}

    fun createArchieve(arciveList : MutableList<Archive>)
    {
        print("Введите имя нового архива: ")
        var newArchieveName: String? = readLine()
        var newArchieveNotes: MutableList<Notes> = arrayListOf()
        var newArchieve: Archive = Archive(newArchieveName.toString(), newArchieveNotes)
        arciveList.add(newArchieve)
        println("${newArchieve.archiveName} cоздано!!!!")
    }

    fun showArchieve(arciveList : MutableList<Archive>) : Boolean
    {
        if (arciveList.size != 0) {
            println("\nСписок архивов")
            for (i in 0 ..arciveList.size - 1) {
            println("${arciveList.indexOf(arciveList[i])} - ${arciveList[i].archiveName}")
            }
            println("\n")
            return true
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один")
            return false
        }
    }

    fun chooseArchieve(arciveList : MutableList<Archive>) : Int
    {
        val scanner = Scanner(System.`in`)

        if (arciveList.size != 0) {
            return(checkIntEntrty("Введите номер архива для просмотра заметок: ", arciveList.size - 1))
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один")
            return -1
        }
    }

    fun deleteArchieveItem(arciveList : MutableList<Archive>)
    {
        if (arciveList.size != 0) {
            arciveList.removeAt(checkIntEntrty("Введите номер архива для удаления: ", arciveList.size - 1))
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один")
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

    fun showNotes(notesList : MutableList<Notes>) : Boolean
    {
        if (notesList.size != 0) {
            println("\nСписок заметок")
            for (i in 0 ..notesList.size - 1) {
                println("Номер заметки: ${notesList.indexOf(notesList[i])} Название заметки: ${notesList[i].notesName}")
                println("Содержание: ${notesList[i].notesText}")
            }
            println("\n")
            return true
        } else {
            println("В архиве пока нет ни одной заметки, добавьте хотя бы одну")
            return false
        }
    }

    fun deleteNotesItem(notesList : MutableList<Notes>)
    {
        if (notesList.size != 0) {
            notesList.removeAt(checkIntEntrty("Введите номер заметки для удаления: ", notesList.size)
            )
        } else {
            println("В архиве пока нет ни одной заметки, добавьте хотя бы одну")
        }

    }





