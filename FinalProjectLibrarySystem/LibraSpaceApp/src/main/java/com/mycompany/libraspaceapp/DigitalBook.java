/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class DigitalBook extends BookType implements Sharable{

    public DigitalBook() {
    }

    public DigitalBook(String title, String author) {
        super(title, author);
    }
        public String getType(){
       // System.out.println("");
        return "You choose an DigitalBook";
    }
        
    @Override
    public String howToShare() {
        return "Share via email or download link";
    }
}
