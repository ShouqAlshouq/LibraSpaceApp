/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class User implements Cloneable {
    public Student student;
    public Librarian librarianl;

    public User(String studID, String studName, String studEmail, String studPhone, String borrowedBooks,
            String librarianId, String librarianName, String librarianEmail, String librarianPhone) {
        
        this.student = new Student(studID, studName,studEmail, studPhone, borrowedBooks);
        this.librarianl = new Librarian(librarianId, librarianName, librarianEmail, librarianPhone);
    }
    
    // shallow copy → only top-level object copied
    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "User{" + "student=" + student + ", librarianl=" + librarianl + '}';
    }
    

}

