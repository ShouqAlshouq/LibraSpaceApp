/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public abstract class BookType {
    private String title;
    private String author;

    public BookType() {
    }

    public BookType(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
     public abstract String getType();

    @Override
    public String toString() {
        return "BookType{" + "title=" + title + ", author=" + author + '}';
    }

}
