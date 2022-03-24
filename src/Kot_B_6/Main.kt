package Kot_B_6

fun main() {
    val kotCatalog = KotCatalog()
    val book1 = kotCatalog.KotBook(KotBookName.FIRST)
    val book2 = kotCatalog.KotBook(KotBookName.SECOND)
    kotCatalog.let {
        it.addBooks(book1, book2)
        it.takeBook(book1, "1")
        it.returnBook(book1)
        it.takeBook(book1, "2")
        it.takeBook(book1, "3")
        it.printRequestHistory(book1)
    }
}
