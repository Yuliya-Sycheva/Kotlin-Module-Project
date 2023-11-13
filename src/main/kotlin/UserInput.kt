class UserInput {
    fun checkInput(command: Int?) {
        if (command == null || command.equals("")) {
            println("Некорректный ввод.")
        } else {
            println("Введите существующий номер пункта меню.")
        }
    }

    fun checkTextInput(command: String?): Boolean {
        return if (command.isNullOrBlank()) {
            println("Данное поле не может быть пустым")
            true
        } else {
            false
        }
    }
}






