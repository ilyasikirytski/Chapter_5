package Kot_B_6

// TODO сначала переделать Java каталог, потом этот
class KotCatalog() {
    private val book = Book()
    fun printRequestHistory() {
        for (s in book.requestHistory) {
            println(s)
        }
    }

    fun makeRequest(book: String, clientName: String) {
        this.book.requestHistory.add(book + clientName)
    }

    class Book {
        var requestHistory = ArrayList<String>()
    }
}