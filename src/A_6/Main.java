/*
Создать класс Catalog с внутренним классом, с помощью объектов которого
можно хранить информацию об истории выдач книги читателям
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Catalog.Book book = new Catalog.Book("1");
        Catalog.Book book2 = new Catalog.Book("2");
        catalog.takeBook(book, "1");
        catalog.takeBook(book, "2");
        catalog.takeBook(book, "3");
        catalog.takeBook(book2, "11");
        catalog.takeBook(book2, "22");
        catalog.takeBook(book2, "33");
        catalog.printRequestHistory("1");
        catalog.printRequestHistory("2");
    }
}
