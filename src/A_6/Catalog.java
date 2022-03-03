package A_6;

import java.util.ArrayList;

public class Catalog {
    private final ArrayList<Book> books = new ArrayList<>();

    public void printRequestHistory(String nameOfBook) {
        System.out.printf("Книгу: %s, брали следующие пользователи:\n", nameOfBook);
        for (Book book : books) {
            if (book.getNameOfBook().contains(nameOfBook)) {
                System.out.println(book.getUsers());
            }
        }
    }

    public void takeBook(Book book, String user) {
        if (!books.contains(book)) {
            books.add(book);
        }
        book.users.add(user);
    }

    public static class Book {
        private final String nameOfBook;
        private final ArrayList<String> users = new ArrayList<>();

        public Book(String nameOfBook) {
            this.nameOfBook = nameOfBook;
        }

        public String getNameOfBook() {
            return nameOfBook;
        }

        public ArrayList<String> getUsers() {
            return users;
        }
    }
}
