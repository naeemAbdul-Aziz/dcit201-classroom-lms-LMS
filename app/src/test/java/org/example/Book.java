package org.example;

public class Book{
    private final String title;
    private final String author;
    private final int yearOfPublishing;

    public Book(String title, String author, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }
    
    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }

}