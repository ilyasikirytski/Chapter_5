package Kot_B_6

class KotCatalog() {
    private val availableBooks = ArrayList<KotBook>()

    fun addBooks(vararg books: KotCatalog.KotBook) {
        availableBooks.addAll(books)
    }

    fun printRequestHistory(kotBook: KotBook) {
        println("Книгу: ${kotBook.nameOfBook}, брали следующие пользователи:")
        println(kotBook.users)
    }

    fun takeBook(kotBook: KotCatalog.KotBook, user: String) {
        if (availableBooks.contains(kotBook)) {
            kotBook.users.add(user)
            availableBooks.remove(kotBook)
            println("Книга ${kotBook.nameOfBook}, была взята пользователем $user")
        } else {
            println("Книга ${kotBook.nameOfBook}, недоступна")
        }
    }

    fun returnBook(kotBook: KotCatalog.KotBook) {
        availableBooks.add(kotBook)
        println("Книга ${kotBook.nameOfBook}, возвращена")
    }

    inner class KotBook(val nameOfBook: KotBookName) {
        val users = ArrayList<String>()
    }
}