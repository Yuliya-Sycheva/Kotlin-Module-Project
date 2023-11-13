import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    val menu = Menu<String>()
    val archiveList = arrayListOf<Archive>()
    val userInput = UserInput()
    var archiveCounter: Int? = null // счетчик номера архива
    var noteCounter: Int? = null // счетчик номера заметки

    while (true) {
        println("Выберите пункт в меню архивов:")
        menu.showArchiveItems(archiveList)
        val archiveCommand = readLine()?.toIntOrNull()
        when (archiveCommand) {
            (archiveList.lastIndex + 3) -> {
                break
            }

            1 -> {
                println("Введите название архива")
                val archiveName = readLine()
                if (userInput.checkTextInput(archiveName)) {
                    continue
                } else {
                    val archive = Archive(archiveName)
                    archiveList.add(archive)
                }
            }

            in 2..(archiveList.lastIndex + 2) -> {
                archiveCounter = archiveCommand
                while (true) {
                    println("Выберите пункт в меню заметок:")
                    val currentArchive: Archive = archiveList[archiveCounter!! - 2]
                    menu.showNoteItems(currentArchive.notesList)
                    val noteCommand = readLine()?.toIntOrNull()
                    when (noteCommand) {
                        (currentArchive.notesList.lastIndex + 3) -> {
                            break
                        }

                        1 -> {
                            println("Введите название заметки")
                            val noteName = scanner.nextLine()
                            if (userInput.checkTextInput(noteName)) {
                                continue
                            } else {
                                println("Введите текст заметки")
                                val noteText = scanner.nextLine()
                                if (userInput.checkTextInput(noteText)) {
                                    continue
                                } else {
                                    val note = Notes(noteName, noteText)
                                    currentArchive.notesList.add(note)
                                }
                            }
                        }

                        in 2..(currentArchive.notesList.lastIndex + 2) -> {
                            noteCounter = noteCommand
                            println("${currentArchive.notesList[noteCounter!! - 2].text}")
                        }

                        else -> {
                            userInput.checkInput(noteCommand)
                        }
                    }
                }
            }

            else -> {
                userInput.checkInput(archiveCommand)
            }
        }
    }
    println("Благодарим Вас за использование нашего приложения! :)")
}
