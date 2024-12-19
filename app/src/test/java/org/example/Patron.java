package main.java.org.example;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Patron{
    private String name;
    private List<Book>borrowedBooks;

    public Patron(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    public void borrowBook(Book book){borrowedBooks.add(book);}

    public void returnBook(Book book){borrowedBooks.remove(book);}

    public void borrowBook(Book book) {
    }
}