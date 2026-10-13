/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class Student {
    private String studID;
    public String studName;
    private String studEmail;
    private String studPhone;
    private String borrowedBooks;
    
    public Student() {
    }

    public Student(String studID, String studName, String studEmail, String studPhone, String borrowedBooks) {
        this.studID = studID;
        this.studName = studName;
        this.studEmail = studEmail;
        this.studPhone = studPhone;
        this.borrowedBooks = borrowedBooks;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public String getStudPhone() {
        return studPhone;
    }

    public void setStudPhone(String studPhone) {
        this.studPhone = studPhone;
    }

    public String getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Student{" + "studID=" + studID + ", studName=" + studName + ", studEmail=" + studEmail + ", studPhone=" + studPhone + ", borrowedBooks=" + borrowedBooks + '}';
    }
    
}
