/*
Создать класс Catalog с внутренним классом, с помощью объектов которого
можно хранить информацию об истории выдач книги читателям
 */
package A_6;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Catalog.Book book = catalog.new Book(BookName.FIRST);
        Catalog.Book book2 = catalog.new Book(BookName.SECOND);
        catalog.addBooks(book, book2);
        catalog.takeBook(BookName.FIRST, "1");
        catalog.returnBook(BookName.FIRST);
        catalog.takeBook(BookName.FIRST, "2");
        catalog.takeBook(BookName.SECOND, "3");
        catalog.takeBook(BookName.SECOND, "11");
        catalog.takeBook(BookName.SECOND, "22");
        catalog.returnBook(BookName.SECOND);
        catalog.takeBook(BookName.SECOND, "33");
        catalog.printRequestHistory(BookName.FIRST);
        catalog.printRequestHistory(BookName.SECOND);
    }
}
