/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.libraspaceapp;


import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author lazys
 */
public class LibraryBooksGUI extends javax.swing.JFrame {

    /**
     * Creates new form LibraryBooks
     */
    public LibraryBooksGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonShowAllBooks = new javax.swing.JButton();
        jButtonFindBook = new javax.swing.JButton();
        jButtonBorrowBook = new javax.swing.JButton();
        jButtonViewBorrowedBooks = new javax.swing.JButton();
        jButtonRemoveBorrowedBook = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jIsBorrowedBook = new javax.swing.JLabel();
        jBookID = new javax.swing.JTextField();
        jBookName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBook = new javax.swing.JTable();
        jLabelStatus = new javax.swing.JLabel();
        jLabelStatus1 = new javax.swing.JLabel();
        jLabelIsBorrowed = new javax.swing.JLabel();
        jTextIsBorrowed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jStudentID = new javax.swing.JTextField();
        jButtonGoBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LibraryBooks");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Welcome to the Library Books");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 340, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Book ID: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 90, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Book Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 136, 80, 10);

        jButtonShowAllBooks.setBackground(new java.awt.Color(0, 102, 204));
        jButtonShowAllBooks.setForeground(new java.awt.Color(255, 255, 255));
        jButtonShowAllBooks.setText("Show All Books");
        jButtonShowAllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllBooksActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAllBooks);
        jButtonShowAllBooks.setBounds(390, 50, 200, 23);

        jButtonFindBook.setBackground(new java.awt.Color(0, 102, 204));
        jButtonFindBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFindBook.setText("Find Book");
        jButtonFindBook.setToolTipText("");
        jButtonFindBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindBookActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFindBook);
        jButtonFindBook.setBounds(390, 90, 200, 23);

        jButtonBorrowBook.setBackground(new java.awt.Color(0, 102, 204));
        jButtonBorrowBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrowBook.setText("Borrow Book");
        jButtonBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrowBookActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBorrowBook);
        jButtonBorrowBook.setBounds(390, 130, 200, 23);

        jButtonViewBorrowedBooks.setBackground(new java.awt.Color(0, 102, 204));
        jButtonViewBorrowedBooks.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewBorrowedBooks.setText("View My Borrowed Books");
        jButtonViewBorrowedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewBorrowedBooksActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViewBorrowedBooks);
        jButtonViewBorrowedBooks.setBounds(390, 170, 200, 23);

        jButtonRemoveBorrowedBook.setBackground(new java.awt.Color(0, 102, 204));
        jButtonRemoveBorrowedBook.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveBorrowedBook.setText("Remove Borrowed Book");
        jButtonRemoveBorrowedBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveBorrowedBookActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemoveBorrowedBook);
        jButtonRemoveBorrowedBook.setBounds(390, 210, 200, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Is borrowed?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 170, 90, 20);
        getContentPane().add(jIsBorrowedBook);
        jIsBorrowedBook.setBounds(130, 110, 170, 0);
        getContentPane().add(jBookID);
        jBookID.setBounds(160, 90, 170, 23);

        jBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookNameActionPerformed(evt);
            }
        });
        getContentPane().add(jBookName);
        jBookName.setBounds(160, 130, 170, 23);

        jTableBook.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBook.setPreferredSize(new java.awt.Dimension(400, 100));
        jScrollPane1.setViewportView(jTableBook);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 630, 190);
        getContentPane().add(jLabelStatus);
        jLabelStatus.setBounds(110, 220, 200, 0);

        jLabelStatus1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelStatus1.setForeground(new java.awt.Color(0, 102, 204));
        jLabelStatus1.setText("Status:");
        getContentPane().add(jLabelStatus1);
        jLabelStatus1.setBounds(70, 250, 260, 15);
        getContentPane().add(jLabelIsBorrowed);
        jLabelIsBorrowed.setBounds(130, 110, 170, 0);

        jTextIsBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIsBorrowedActionPerformed(evt);
            }
        });
        getContentPane().add(jTextIsBorrowed);
        jTextIsBorrowed.setBounds(160, 170, 170, 23);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 46, 70, 30);
        getContentPane().add(jStudentID);
        jStudentID.setBounds(160, 50, 170, 23);

        jButtonGoBack.setBackground(new java.awt.Color(0, 102, 204));
        jButtonGoBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGoBack.setText("Go Back");
        jButtonGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGoBack);
        jButtonGoBack.setBounds(390, 250, 200, 23);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowAllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllBooksActionPerformed
        BooksDAO booksDAO = new BooksDAO();
        List<Book> bookList = null;
        try {
            bookList = booksDAO.getAllBooks();
        } catch (SQLException sqlex) {
            jLabelStatus1.setText("Database error: " + sqlex.getMessage());
        }

        //convert the employeeList and data in it to a vector of vectors
        Vector rowDataVector = new Vector();
        Vector columnDataVector = null;
        for (Book book : bookList) {
            columnDataVector = new Vector();
            columnDataVector.add(book.getBookID());
            columnDataVector.add(book.getTitle());
            columnDataVector.add(book.getAuthor());
            columnDataVector.add(book.getPublisher());
            columnDataVector.add(book.getGenre());
            columnDataVector.add(book.getNumPages());
            columnDataVector.add(book.isIsBorrowed());

            //add this column data vector to the rowDataVector
            rowDataVector.add(columnDataVector);
        }

        //create a vector for column names
        Vector columnNamesVector = new Vector();
        columnNamesVector.add("bookID");
        columnNamesVector.add("title");
        columnNamesVector.add("author");
        columnNamesVector.add("publisher");
        columnNamesVector.add("genre");
        columnNamesVector.add("numPages");
        columnNamesVector.add("isBorrowed");

        //init the JTable instance using the row data and column data vectors
        jTableBook = new JTable(rowDataVector, columnNamesVector);
        jScrollPane1.setViewportView(jTableBook);
    }//GEN-LAST:event_jButtonShowAllBooksActionPerformed

    private void jBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBookNameActionPerformed

    private void jButtonFindBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindBookActionPerformed
        String title = jBookName.getText().trim();

    if (title.isEmpty()) {
        jLabelStatus1.setText("Enter a book name!");
        return;
    }

    BooksDAO booksDAO = new BooksDAO();
    try {
        Book book = booksDAO.findBookByName(title);

        if (book == null) {
            jLabelStatus1.setText(title + " not found!");
            return;
        }

        jBookID.setText(book.getBookID());
        jTextIsBorrowed.setText(book.isIsBorrowed() + "");

        jLabelStatus1.setText("Book found!");
    } catch (SQLException e) {
        jLabelStatus1.setText("DB Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButtonFindBookActionPerformed

    private void jTextIsBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIsBorrowedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIsBorrowedActionPerformed

    private void jButtonViewBorrowedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewBorrowedBooksActionPerformed
   String studentId = jStudentID.getText().trim();

    if (studentId.isEmpty()) {
        jLabelStatus1.setText("Enter Student ID!");
        return;
    }

    StudentDAO studentDAO = new StudentDAO();
    BooksDAO booksDAO = new BooksDAO();

    try {
        Student student = studentDAO.findStudentById(studentId);

        if (student == null) {
            jLabelStatus1.setText("Invalid Student ID!");
            return;
        }

        String borrowed = student.getBorrowedBooks();

        if (borrowed == null || borrowed.equalsIgnoreCase("none")) {
            jLabelStatus1.setText("You have not borrowed any books.");
            return;
        }

        Book book = booksDAO.findBookByName(borrowed);

        if (book == null) {
            jLabelStatus1.setText("Borrowed book record missing.");
            return;
        }

        Vector row = new Vector();
        row.add(book.getBookID());
        row.add(book.getTitle());
        row.add(book.getAuthor());
        row.add(book.getPublisher());
        row.add(book.getGenre());
        row.add(book.getNumPages());
        row.add(book.isIsBorrowed());

        Vector data = new Vector();
        data.add(row);

        Vector cols = new Vector();
        cols.add("Book ID");
        cols.add("Title");
        cols.add("Author");
        cols.add("Publisher");
        cols.add("Genre");
        cols.add("Pages");
        cols.add("Borrowed");

        jTableBook = new JTable(data, cols);
        jScrollPane1.setViewportView(jTableBook);

        jLabelStatus1.setText("Borrowed book displayed.");

    } catch (SQLException e) {
        jLabelStatus1.setText("DB Error: " + e.getMessage());
    }
    }//GEN-LAST:event_jButtonViewBorrowedBooksActionPerformed

    private void jButtonRemoveBorrowedBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveBorrowedBookActionPerformed
   String studentId = jStudentID.getText().trim();
    String bookId = jBookID.getText().trim();

    // Validate student ID
    if (studentId.isEmpty()) {
        jLabelStatus1.setText("Enter Student ID!");
        return;
    }

    // Validate book ID (the book to return)
    if (bookId.isEmpty()) {
        jLabelStatus1.setText("Enter Book ID to return!");
        return;
    }

    StudentDAO studentDAO = new StudentDAO();
    BooksDAO booksDAO = new BooksDAO();

    try {
        // 1) Check if student exists
        Student student = studentDAO.findStudentById(studentId);
        if (student == null) {
            jLabelStatus1.setText("Invalid Student ID!");
            return;
        }

        // 2) Check if student borrowed something
        String borrowedBookTitle = student.getBorrowedBooks();

        if (borrowedBookTitle == null 
                || borrowedBookTitle.equalsIgnoreCase("none") 
                || borrowedBookTitle.trim().isEmpty()) {
            jLabelStatus1.setText("Student has no borrowed books.");
            return;
        }

        // 3) Find book by ID
        Book book = null;
        try {
            // We must find book by ID, not title
            List<Book> allBooks = booksDAO.getAllBooks();
            for (Book b : allBooks) {
                if (b.getBookID().equals(bookId)) {
                    book = b;
                    break;
                }
            }
        } catch (SQLException ex) {
            jLabelStatus1.setText("DB Error: " + ex.getMessage());
            return;
        }

        if (book == null) {
            jLabelStatus1.setText("Book ID not found!");
            return;
        }

        // 4) Ensure this is the same book the student borrowed
        if (!book.getTitle().equalsIgnoreCase(borrowedBookTitle)) {
            jLabelStatus1.setText("This student did NOT borrow this book.");
            return;
        }

        // 5) Update student → set borrowed to none
        int studUpdate = studentDAO.updateBorrowedBook(studentId, "none");

        // 6) Update book → set isBorrowed to false
        int bookUpdate = booksDAO.updateIsBorrowed(bookId, false);

        if (studUpdate == 1 && bookUpdate == 1) {
            jLabelStatus1.setText("Book successfully returned!");
        } else {
            jLabelStatus1.setText("Error processing the return.");
        }

    } catch (SQLException ex) {
        jLabelStatus1.setText("DB Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_jButtonRemoveBorrowedBookActionPerformed

    private void jButtonBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrowBookActionPerformed
        String studentId = jStudentID.getText().trim();
    String bookTitle = jBookName.getText().trim();

    if (studentId.isEmpty() || bookTitle.isEmpty()) {
        jLabelStatus1.setText("Enter Student ID and Book Name!");
        return;
    }

    StudentDAO studentDAO = new StudentDAO();
    BooksDAO booksDAO = new BooksDAO();

    try {
        // 1) Check student
        Student student = studentDAO.findStudentById(studentId);
        if (student == null) {
            jLabelStatus1.setText("Invalid Student ID!");
            return;
        }

        // 2) Find book
        Book book = booksDAO.findBookByName(bookTitle);
        if (book == null) {
            jLabelStatus1.setText("Book not found!");
            return;
        }

        // 3) Check book availability
        if (book.isIsBorrowed()) {
            jLabelStatus1.setText("This book is already borrowed.");
            return;
        }

        // 4) Update student
        int studUpdate = studentDAO.updateBorrowedBook(studentId, book.getTitle());

        // 5) Update book availability
        int bookUpdate = booksDAO.updateIsBorrowed(book.getBookID(), true);

        if (studUpdate == 1 && bookUpdate == 1) {
            jLabelStatus1.setText("Book successfully borrowed!");
        } else {
            jLabelStatus1.setText("Error while borrowing the book.");
        }

    } catch (SQLException ex) {
        jLabelStatus1.setText("DB Error: " + ex.getMessage());
    }

    }//GEN-LAST:event_jButtonBorrowBookActionPerformed

    private void jButtonGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoBackActionPerformed
        LibraryMenuGUI libBook = new LibraryMenuGUI();
        libBook.show();
        this.dispose();
    }//GEN-LAST:event_jButtonGoBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBookID;
    private javax.swing.JTextField jBookName;
    private javax.swing.JButton jButtonBorrowBook;
    private javax.swing.JButton jButtonFindBook;
    private javax.swing.JButton jButtonGoBack;
    private javax.swing.JButton jButtonRemoveBorrowedBook;
    private javax.swing.JButton jButtonShowAllBooks;
    private javax.swing.JButton jButtonViewBorrowedBooks;
    private javax.swing.JLabel jIsBorrowedBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelIsBorrowed;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatus1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jStudentID;
    private javax.swing.JTable jTableBook;
    private javax.swing.JTextField jTextIsBorrowed;
    // End of variables declaration//GEN-END:variables
}
