/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
import java.sql.*;
import java.util.*;

public class BooksDAO {

    public Book findBookByName(String title) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String querySQL = "SELECT * FROM book WHERE title='" + title + "';";
        ResultSet rs = stmt.executeQuery(querySQL);

        Book book = null;

        if (rs.next()) {
            String bookID = rs.getString("bookID");
            String author = rs.getString("author");
            String publisher = rs.getString("publisher");
            String genre = rs.getString("genre");
            int numPages = rs.getInt("numPages");
            boolean isBorrowed = rs.getBoolean("isBorrowed");

            book = new Book(bookID, title, author, publisher, genre, numPages, isBorrowed);
        }

        //close result set, statement and the connection to the database
        stmt.close();
        rs.close();
        conn.close();

        return book;
    }

    public int addNewBook(String bookID, String title, String author, String publisher, String genre, int numPages, boolean isBorrowed) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String insertSQL = "INSERT INTO book VALUES('" + bookID + "','" + title + "','" + author + "','" + publisher + "','" + genre + "'," + numPages + "," + isBorrowed + ");";
        System.out.println(insertSQL);
        Statement stmt = conn.createStatement();
        int insertStatus = stmt.executeUpdate(insertSQL);
        stmt.close();
        conn.close();
        return insertStatus;
    }

    /*
        Update book record by bookID
     */
    public int updateBook(String bookID, String title, String author, String publisher, String genre, int numPages, boolean isBorrowed) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String updateSQL = "UPDATE book SET title ='" + title + "',author = '" + author + "',publisher='" + publisher + "',genre = '" + genre + "',numPages = " + numPages + ",isBorrowed = " + isBorrowed + " WHERE bookID='" + bookID + "';";
        System.out.println(updateSQL);
        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);
        stmt.close();
        conn.close();
        return updateStatus;
    }

    public int updateIsBorrowed(String bookID, boolean isBorrowed) throws SQLException {
        Connection conn = DBConnection.getConnection();

        String updateSQL = "UPDATE book SET isBorrowed = "
                + (isBorrowed ? 1 : 0) + " WHERE bookID='" + bookID + "';";

        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);

        stmt.close();
        conn.close();
        return updateStatus;
    }

    public int deleteBook(String bookID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String deleteSQL = "DELETE FROM book WHERE bookID=?;";
        System.out.println(deleteSQL);
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.setString(1, bookID);
        int deleteStatus = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return deleteStatus;
    }

    public List<Book> getAllBooks() throws SQLException {
        String sql = "SELECT * FROM book";

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        Book book;
        List<Book> bookList = new ArrayList<>();
        while (rs.next()) {
            String bookID = rs.getString("bookID");
            String title = rs.getString("title");
            String author = rs.getString("author");
            String publisher = rs.getString("publisher");
            String genre = rs.getString("genre");
            int numPages = rs.getInt("numPages");
            boolean isBorrowed = rs.getBoolean("isBorrowed");

            //put the data from the resultset into an Book Object
            book = new Book(bookID, title, author, publisher, genre, numPages, isBorrowed);

            //add book to the bookList
            bookList.add(book);
        }

        //close all the db resources
        rs.close();
        stmt.close();
        conn.close();

        return bookList;
    }
} //end BooksDAO class

