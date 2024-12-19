package main.java.org.example;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book>books = new ArrayList<>();
    private List<main.java.org.example.Patron>patrons = new ArrayList<>();


    public Library(){
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void registerPatron(main.java.org.example.Patron patron){
        patrons.add(patron);
    }

    public void lendBook(Book book, main.java.org.example.Patron patron){
         if(books.contains(book) && !patron.getBorrowedBooks().contains(book)){
    patron.borrowBook(book);
    books.remove(book);
}
 }

 public void returnBook(Book book, Patron patron){
    if(patron.getBorrowedBooks().contains(book)){
        patron.returnBook(book);
        books.add(book);
 }
 }

 public List<Book> getAvailableBooks(){
    return books;}

    public List<Patron> getPatrons() {
        return patrons;}

}