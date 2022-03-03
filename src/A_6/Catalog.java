package A_6;

import java.util.ArrayList;

public class Catalog {
    private final ArrayList<Book> books = new ArrayList<>();

    public void printRequestHistory(Book book) {
        System.out.printf("Книгу: %s, брали следующие пользователи:\n", book.getNameOfBook());
        for (Book b : books) {
            if (b.getNameOfBook().contains(book.getNameOfBook())) {
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
