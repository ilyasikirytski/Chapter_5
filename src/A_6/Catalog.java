package A_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Catalog {
    private final ArrayList<Book> availableBooks = new ArrayList<>();
    private final ArrayList<Book> takenBooks = new ArrayList<>();

    public void addBooks(Book... books) {
        availableBooks.addAll(Arrays.asList(books));
    }

    public void printRequestHistory(BookName bookName) {
        for (Book book : availableBooks) {
            if (book.nameOfBook == bookName) {
                System.out.printf("Книгу: %s, брали следующие пользователи:\n", book.nameOfBook);
                System.out.println(book.getUsers());
            }
        }
    }

    public void takeBook(BookName bookName, String user) {
//        Iterator<Book> iterator = availableBooks.iterator();
//        while (iterator.hasNext()){
        Iterator<Book> iterator = availableBooks.iterator();
        Book book = iterator.next();
        if (book.getNameOfBook() == bookName) {
            book.getUsers().add(user);
            availableBooks.remove(book);
            takenBooks.add(book);
            System.out.printf("Книга %s, была взята пользователем %s\n", bookName, user);
        } else {
            System.out.printf("Книга %s, недоступна\n", bookName);
        }
//        }
//        for (Book book : availableBooks) {
//            if (book.getNameOfBook() == bookName) {
//                book.getUsers().add(user);
//                availableBooks.remove(book);
//                System.out.printf("Книга %s, была взята пользователем %s\n", book.getNameOfBook(), user);
//            } else {
//                System.out.printf("Книга %s, недоступна\n", book.getNameOfBook());
//            }
//        }
    }

    public void returnBook(BookName bookName) {
        Iterator<Book> iterator = takenBooks.iterator();
        Book book = iterator.next();
        if (book.getNameOfBook() == bookName) {
            availableBooks.add(book);
            takenBooks.remove(book);
            System.out.printf("Книга %s, возвращена\n", bookName);
        }
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
