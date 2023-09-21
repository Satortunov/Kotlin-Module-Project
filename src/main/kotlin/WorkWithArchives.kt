package WorkWithArchives

import java.util.Scanner
import Utils.*

class Notes(var notesName: String, var notesText: String)


class Archive(val archiveName: String, val notes: MutableList<Notes>)


    fun createArchieve(arciveList : MutableList<Archive>) {
        print("Введите имя нового архива: ")
        val newArchieveName: String? = readLine()
        val newArchieveNotes: MutableList<Notes> = arrayListOf()
        val newArchieve: Archive = Archive(newArchieveName.toString(), newArchieveNotes)
        if (newArchieveName != "") {
            arciveList.add(newArchieve)
            println("Архив ${newArchieve.archiveName} cоздан!\n")
        } else {
            println("Имя архива не может быть пустым, попытайтесь снова!\n")
        }
    }

    fun showArchieve(arciveList : MutableList<Archive>) : Boolean {
        return if (arciveList.size != 0) {
            println("Список архивов")
            for (i in 0 ..arciveList.size - 1) {
                println("${arciveList.indexOf(arciveList[i])} - ${arciveList[i].archiveName}")
            }
            true
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один\n")
            false
        }
    }

    fun chooseArchieve(arciveList : MutableList<Archive>) : Int {
        return if (arciveList.size != 0) {
            (checkIntEntrty("Введите номер архива для работы с заметками: ", arciveList.size - 1))
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один\n")
            -1
        }
    }

    fun deleteArchieveItem(arciveList : MutableList<Archive>) {
        if (arciveList.size != 0) {
            val exitNum: Int = checkIntEntrty("Введите номер архива для удаления, или нажмите ${arciveList.size} для выхода: ", arciveList.size)
            if (exitNum == arciveList.size) {
            } else {
                arciveList.removeAt(exitNum)
                println("Архив удален")
            }
        } else {
            println("В архиве пока нет ни одного элемента, добавьте хотя бы один\n")
        }
    }

    fun createNote(archive: Archive) {
        var note: Notes = Notes("", "")
        print("Введите название новой заметки: ")
        note.notesName = readLine().toString()
        if (note.notesName != "") {
                print("Введите содержание новой заметки: ")
                note.notesText = readLine().toString()
           if  (note.notesText != "") {
               archive.notes.add(note)
               println("Заметка ${note.notesName} cоздана!\n")
           } else {
               println("Содержание заметки не может быть пустым, попытайтесь снова\n")
           }

        } else {
            println("Имя заметки не может быть пустым, попытайтесь снова\n")
        }
    }

    fun showNotes(archive: Archive) : Boolean {
        if (archive.notes.size != 0) {
            println("Список заметок")
            for (i in 0 ..archive.notes.size - 1) {
                println("${archive.notes.indexOf(archive.notes[i])} - Название заметки: ${archive.notes[i].notesName}, содержание заметки: ${archive.notes[i].notesText}")
            }
            println("")
            return true
        } else {
            println("В архиве пока нет ни одной заметки, добавьте хотя бы одну\n")
            return false
        }
    }

fun showNote(archive: Archive, noteNum : Int) : Boolean {
    if (archive.notes.size != 0) {
        println("Просмотр заметки ${archive.notes[noteNum].notesName}")
        println("Номер заметки: ${archive.notes.indexOf(archive.notes[noteNum])} Название заметки: ${archive.notes[noteNum].notesName}")
        println("Содержание: ${archive.notes[noteNum].notesText}")
        println()
        return true
    } else {
        println("В архиве пока нет ни одной заметки, добавьте хотя бы одну\n")
        return false
    }
}
fun chooseNote(archive: Archive) : Int {
    if (archive.notes.size != 0) {
        return(checkIntEntrty("Введите номер заметки для просмотра: ", archive.notes.size - 1))
    } else {
        println("В архиве пока нет ни одной заметки, добавьте хотя бы одну\n")
        return -1
    }
}

    fun deleteNotesItem(archive: Archive) {
        if (archive.notes.size != 0) {
            val exitNum: Int = checkIntEntrty("Введите номер заметки для удаления, или нажмите ${archive.notes.size} для выхода: ", archive.notes.size)
            if (exitNum == archive.notes.size) {
            } else {
                archive.notes.removeAt(exitNum)
                println("Заметка удалена")
            }
        } else {
            println("В архиве пока нет ни одной заметки, добавьте хотя бы одну\n")
        }

    }