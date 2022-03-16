package A_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {
    private final ArrayList<Book> availableBooks = new ArrayList<>();

    public void addBooks(Book... books) {
        availableBooks.addAll(Arrays.asList(books));
    }

    public void printRequestHistory(Book book) {
        System.out.printf("Книгу: %s, брали следующие пользователи:\n", book.getNameOfBook());
        System.out.println(book.getUsers());
    }

    public void takeBook(Book book, String user) {
        if (availableBooks.contains(book)) {
            book.users.add(user);
            availableBooks.remove(book);
            System.out.printf("Книга %s, была взята пользователем %s\n", book.getNameOfBook(), user);
        } else {
            System.out.printf("Книга %s, недоступна\n", book.getNameOfBook());
        }
    }

    public void returnBook(Book book) {
        availableBooks.add(book);
        System.out.printf("Книга %s, возвращена\n", book.nameOfBook);
    }

    public class Book {
        private final BookName nameOfBook;
        private final ArrayList<String> users = new ArrayList<>();

        public Book(BookName nameOfBook) {
            this.nameOfBook = nameOfBook;
        }

        public BookName getNameOfBook() {
            return nameOfBook;
        }

        public ArrayList<String> getUsers() {
            return users;
        }
    }
}
