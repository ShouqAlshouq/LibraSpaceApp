/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */

public class PaperBook extends BookType{

    public PaperBook() {
    }

    public PaperBook(String title, String author) {
        super(title, author);
    }
    
    public String getType(){
        return "You choose an PaperBook";
    }
}
