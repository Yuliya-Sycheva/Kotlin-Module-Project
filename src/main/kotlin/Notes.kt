class Notes(
    private val name: String,
    val text: String?
) {
    override fun toString(): String {
        return name
    }

    val notesList = mutableListOf<String>()
}