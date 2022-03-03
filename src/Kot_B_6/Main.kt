package Kot_B_6

fun main() {
    val kotCatalog = KotCatalog()
    val book = kotCatalog.Book("1")
    kotCatalog.takeBook(book, "1")
    kotCatalog.takeBook(book, "2")
    kotCatalog.takeBook(book, "3")
    kotCatalog.printRequestHistory(book)
}
