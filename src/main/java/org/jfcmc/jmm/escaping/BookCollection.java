package org.jfcmc.jmm.escaping;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
        books.add(new Book(1, "Don Quixote", "Miguel De Cervantes", 3.99));
        books.add(new Book(2, "Pilgrim's Progress", "Miguel De Cervantes", 4.45));
        books.add(new Book(3, "Roobinson Crusoe", "Daniel Defoe", 3.99));
        books.add(new Book(4, "Gulliver's Travels", "Jonathan Swift", 7.60));
        books.add(new Book(5, "Tom Jones", "Henry Fielding", 9.99));
        books.add(new Book(6, "Clarissa", "Samuel Richardson", 4.45));
        books.add(new Book(7, "Dangerous Liaisons", "Pierre Choderlos De Laclos", 11.50));
        books.add(new Book(8, "Emma", "Jane Austen", 3.99));
        books.add(new Book(9, "Frankenstein", "Mary Shelly", 7.60));
        books.add(new Book(10, "The Count of Monte Christo", "Alexander Dumas", 3.99));
    }

    public Book findBookByName(String title) {
        return books.stream()
            .filter(book -> book.getTitle().equals(title))
            .findFirst()
            .orElse(null);
    }

    public void printAllBooks() {
        books.stream()
            .forEach(book -> System.out.println(book.getTitle() +
                                                ": "  +
                                                book.getPrice()));
    }
}
