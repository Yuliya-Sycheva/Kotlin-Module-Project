class Menu<T> {
    fun showArchiveItems(items: ArrayList<Archive>) {
        println("1. Создать")
        if (items.size == 0) {
            println("2. Выход")
        } else {
            items.forEachIndexed { index, item ->
                println("${index + 2}. $item")
            }
            println("${items.lastIndex + 3}. Выход")
        }
    }

    fun showNoteItems(items: ArrayList<Notes>) {
        println("1. Создать")
        if (items.size == 0) {
            println("2. Назад")
        } else {
            items.forEachIndexed { index, item ->
                println("${index + 2}. $item")
            }
            println("${items.lastIndex + 3}. Назад")
        }
    }
}
