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

public class LibrarianDAO {
    
    public Librarian findLibrarianById(String librarianId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        
        String querySQL = "SELECT * FROM librarian WHERE librarian_id='" + librarianId + "';";
        ResultSet rs = stmt.executeQuery(querySQL);
        
        Librarian librarian = null;
        
        if (rs.next()) {
            String librarianName = rs.getString("librarian_name");
            String librarianEmail = rs.getString("librarian_email");
            String librarianPhone = rs.getString("librarian_phone");
            
            librarian = new Librarian(librarianId, librarianName, librarianEmail, librarianPhone);
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
        return librarian;
    }
    
    
    public int addNewLibrarian(String librarianId, String librarianName, String librarianEmail, String librarianPhone) throws SQLException {
        Connection conn = DBConnection.getConnection();

         String insertSQL = "INSERT INTO librarian VALUES('"+librarianId+"','" +librarianName+ "','"+ librarianEmail+"'," + librarianPhone+");";
        System.out.println(insertSQL);
        
        Statement stmt = conn.createStatement();
        int insertStatus = stmt.executeUpdate(insertSQL);
        
        stmt.close();
        conn.close();
        
        return insertStatus;
    }
    
    
    public int updateLibrarian(String librarianId, String librarianName, String librarianEmail, String librarianPhone) throws SQLException {
        Connection conn = DBConnection.getConnection();
        
        String updateSQL = "UPDATE librarian SET librarian_name='" 
                + librarianName + "', librarian_email='" 
                + librarianEmail + "', librarian_phone='" 
                + librarianPhone + "' WHERE librarian_id=" 
                + librarianId + ";";
        
        System.out.println(updateSQL);
        
        Statement stmt = conn.createStatement();
        int updateStatus = stmt.executeUpdate(updateSQL);
        
        stmt.close();
        conn.close();
        
        return updateStatus;
    }
    
    
    public int deleteLibrarian(String librarianId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        
        String deleteSQL = "DELETE FROM librarian WHERE librarian_id=?;";
        System.out.println(deleteSQL);
        
        PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        pstmt.setString(1, librarianId);
        
        int deleteStatus = pstmt.executeUpdate();
        
        pstmt.close();
        conn.close();
        
        return deleteStatus;
    }
    
    
    public List<Librarian> getAllLibrarians() throws SQLException {
        List<Librarian> librarianList = new ArrayList<>();
        
        String sql = "SELECT * FROM librarian";
        
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            String librarianId = rs.getString("librarian_id");
            String librarianName = rs.getString("librarian_name");
            String librarianEmail = rs.getString("librarian_email");
            String librarianPhone = rs.getString("librarian_phone");
            
            Librarian librarian = new Librarian(librarianId, librarianName, librarianEmail, librarianPhone);
            librarianList.add(librarian);
        }
        
        rs.close();
        stmt.close();
        conn.close();
        
        return librarianList;
    }
    
}
