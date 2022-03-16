package Kot_B_6

fun main() {
    val kotCatalog = KotCatalog()
    val book1 = kotCatalog.KotBook(KotBookName.FIRST)
    val book2 = kotCatalog.KotBook(KotBookName.SECOND)
    kotCatalog.addBooks(book1, book2)
    kotCatalog.takeBook(book1, "1")
    kotCatalog.returnBook(book1)
    kotCatalog.takeBook(book1, "2")
    kotCatalog.takeBook(book1, "3")
    kotCatalog.printRequestHistory(book1)
}
