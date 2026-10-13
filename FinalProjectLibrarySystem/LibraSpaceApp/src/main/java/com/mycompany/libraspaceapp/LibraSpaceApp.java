/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */

import java.util.*;

public class LibraSpaceApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Generic
        MyList<Book> bookList = new MyList<>(3);

        System.out.println("---- Generic ----\n");

        bookList.add(new Book("B01", "Harry Potter", "J.K. Rowling", "Bloomsbury", "Fantasy", 450, false));
        bookList.add(new Book("B02", "Atomic Habits", "James Clear", "Avery", "Self-help", 320, false));
        bookList.add(new Book("B03", "The Hobbit", "J.R.R. Tolkien", "HarperCollins", "Fantasy", 370, true));

        Book b1 = bookList.get(0);
        Book b2 = bookList.get(2);
        Book b3 = bookList.get(1);

        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getTitle());
        System.out.println("\n------------------------");

        // Abstract
        System.out.println("---- Abstract ----");
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the type of book you want:");
        System.out.println("1 - Digital Book");
        System.out.println("2 - Paper Book");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        try {
            if (choice == 1) {
                System.out.print(new DigitalBook().getType());
                System.out.println("\n---- Interface ----");
                System.out.print(new DigitalBook().howToShare());
            } else if (choice == 2) {
                System.out.print(new PaperBook().getType());
            } else {
                // throw using the constructor that accepts a custom message
                throw new LibraryExeception("Invalid choice! Please choose 1 (Digital) or 2 (Paper).");
            }
        } catch (LibraryExeception ex) {
            // handle it: show friendly message
            System.out.println("Library error: " + ex.getMessage());
            // optionally exit or continue - here we'll exit
            input.close();
            return;
        }

        System.out.println("\n------------------------");

        // Shallow clone example
        System.out.println("---- Shallow Clone ----");

        User u1 = new User("H00492224", "jamila", "h0049222@hct.ac.ae", "05011111111", "Cosmos",
                           "L001", "Sara", "sara@gmail.com", "504444444");
        User u2 = u1.clone();

        System.out.println("Original: " + u1);
        System.out.println("Clone   : " + u2);

        // Modify clone
        u2.student.studName = "Maha";

        System.out.println("\nAfter modifying clone:");
        System.out.println("Original: " + u1);
        System.out.println("Clone   : " + u2);

        System.out.println("\n------------------------");
        input.close();
    }
}