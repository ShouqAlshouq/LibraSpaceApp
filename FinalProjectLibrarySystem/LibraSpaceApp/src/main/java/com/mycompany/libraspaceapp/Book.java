/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class Book implements Cloneable {
    private String bookID;
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private int numPages;
    private boolean isBorrowed;
    
    public Book(String bookID, String title, String author, String publisher, String genre, int numPages, boolean isBorrowed) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.numPages = numPages;
        this.isBorrowed = isBorrowed;
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumPages() {
        return numPages;
    }

    public boolean isIsBorrowed() {
        return isBorrowed;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
 // **** Cloning ****

    @Override
    public Object clone() {
        try {
            return super.clone();  // Shallow clone
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookID=" + bookID + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", genre=" + genre + ", numPages=" + numPages + ", isBorrowed=" + isBorrowed + '}';
    }
    
}