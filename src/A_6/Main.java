/*
Создать класс Catalog с внутренним классом, с помощью объектов которого
можно хранить информацию об истории выдач книги читателям
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.makeRequest("book1 ", "john");
        catalog.makeRequest("book2 ", "john2");
        catalog.makeRequest("book3 ", "john3");
        catalog.makeRequest("book4 ", "john4");
        catalog.printRequestHistory();
    }
}
