package A_6;

import java.util.ArrayList;

// TODO идентично department
public class Catalog {
    // TODO одна книга в библиотеке?))
    private final Catalog.Book book = new Catalog.Book();

    public void printRequestHistory() {
        for (String s : book.requestHistory) {
            System.out.println(s);
        }
    }

    public void makeRequest(String book, String clientName) {
        this.book.requestHistory.add(book + clientName);
    }

    // TODO а когда берешь книгу к ней тебе дают еще три - список людей которые ее брали, точнее это
    //  написано в конце книги, ее просто расширяют)))
    public static class Book {
        ArrayList<String> requestHistory = new ArrayList<>();
    }
}
