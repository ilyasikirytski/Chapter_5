package A_6;

import java.util.ArrayList;

public class Catalog {
    private final Catalog.Book book = new Catalog.Book();

    public void printRequestHistory() {
        for (String s : book.requestHistory) {
            System.out.println(s);
        }
    }

    public void makeRequest(String book, String clientName) {
        this.book.requestHistory.add(book + clientName);
    }

    public static class Book {
        ArrayList<String> requestHistory = new ArrayList<>();
    }
}
