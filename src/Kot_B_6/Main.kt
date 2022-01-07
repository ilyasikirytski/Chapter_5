package Kot_B_6

fun main() {
    val kotCatalog = KotCatalog()
    kotCatalog.makeRequest("kotbook1 ", "john")
    kotCatalog.makeRequest("kotbook2 ", "john2")
    kotCatalog.makeRequest("kotbook3 ", "john3")
    kotCatalog.makeRequest("kotbook4 ", "john4")
    kotCatalog.printRequestHistory()
}
