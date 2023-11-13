class Archive(
    private val name: String?,
    val notesList: ArrayList<Notes> = arrayListOf<Notes>()
) {
    override fun toString(): String {
        return name ?: ""
    }
}