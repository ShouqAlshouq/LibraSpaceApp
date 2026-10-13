/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class Librarian{
    private String librarianId;
    private String librarianName;
    private String librarianEmail;
    private String librarianPhone;

    // Constructor
    public Librarian(String librarianId, String librarianName, String librarianEmail, String librarianPhone) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.librarianEmail = librarianEmail;
        this.librarianPhone = librarianPhone;
    }

    // Getters and Setters
    
    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianEmail() {
        return librarianEmail;
    }

    public void setLibrarianEmail(String librarianEmail) {
        this.librarianEmail = librarianEmail;
    }

    public String getLibrarianPhone() {
        return librarianPhone;
    }

    public void setLibrarianPhone(String librarianPhone) {
        this.librarianPhone = librarianPhone;
    }

    // toString method
    @Override
    public String toString() {
        return "Librarian Details: " +
               "\nID: " + librarianId +
               "\nName: " + librarianName +
               "\nEmail: " + librarianEmail +
               "\nPhone: " + librarianPhone;
    }
}