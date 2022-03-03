package Kot_B_6

class KotCatalog() {
    private val books = ArrayList<Book>()

    fun printRequestHistory(book: Book) {
        System.out.printf("Книгу: %s, брали следующие пользователи:\n", book.nameOfBook)
        for (b in books) {
            if (book.nameOfBook.contains(book.nameOfBook)) {
                println(book.users)
            }
        }
    }

    fun takeBook(book: Book, user: String) {
        if (!books.contains(book)) {
            books.add(book)
        }
        book.users.add(user)
    }

    inner class Book(val nameOfBook: String) {
        val users = ArrayList<String>()
    }
}