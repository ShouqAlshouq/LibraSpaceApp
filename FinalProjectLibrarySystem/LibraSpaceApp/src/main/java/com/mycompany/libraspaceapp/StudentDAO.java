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

public class StudentDAO {

    public Student findStudentById(String studID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String querySQL = "SELECT * FROM student WHERE student_id='" + studID + "';";
        ResultSet rs = stmt.executeQuery(querySQL);

        Student student = null;

        if (rs.next()) {
            String studName = rs.getString("student_name");
            String studEmail = rs.getString("student_email");
            String studPhone = rs.getString("student_phone");
            String borrowedBooks = rs.getString("books_borrowed");

            student = new Student(studID, studName, studEmail, studPhone, borrowedBooks);
        }

        //close result set, statement and the connection to the database
        stmt.close();
        rs.close();
        conn.close();

        return student;
    }

    public int addNewStudent(String studID, String studName, String studEmail, String studPhone, String borrowedBooks) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String insertSQL = "INSERT INTO student VALUES('" + studID + "','" + studName + "','" + studEmail + "','" + studPhone + "','" + borrowedBooks + "');";
        System.out.println(insertSQL);
        Statement stmt = conn.createStatement();
        int insertStatus = stmt.executeUpdate(insertSQL);
        stmt.close();
        conn.close();
        return insertStatus;
    }

    public int updateBorrowedBook(String studID, String borrowedBook) throws SQLException {
        Connection conn = DBConnection.getConnection();

        String updateSQL = "UPDATE student SET books_borrowed = '"
                + borrowedBook + "' WHERE student_id='" + studID + "';";

        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);

        stmt.close();
        conn.close();
        return updateStatus;
    }

    public int updateStudent(String studID, String studName, String studEmail, String studPhone) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String updateSQL = "UPDATE STUDENT SET student_name ='" + studName + "',student_email = '" + studEmail + "',student_phone=" + studPhone + " WHERE student_id='" + studID + "';";
        System.out.println(updateSQL);
        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);
        stmt.close();
        conn.close();
        return updateStatus;
    }

    public int deleteString(String studID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String deleteSQL = "DELETE FROM STUDENT WHERE student_id=?;";
        System.out.println(deleteSQL);
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.setString(1, studID);
        int deleteStatus = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return deleteStatus;
    }

    public List<Student> getAllStudnets() throws SQLException {
        String sql = "SELECT * FROM STUDENT";

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        Student student;
        List<Student> studList = new ArrayList<>();
        while (rs.next()) {
            String studID = rs.getString("student_id");
            String studName = rs.getString("student_name");
            String studEmail = rs.getString("student_email");
            String studPhone = rs.getString("student_phone");
            String borrowedBooks = rs.getString("books_borrowed");
            student = new Student(studID, studName, studEmail, studPhone, borrowedBooks);

            studList.add(student);
        }

        //close all the db resources
        rs.close();
        stmt.close();
        conn.close();

        return studList;
    }

}
