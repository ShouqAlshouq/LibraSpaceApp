/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author jamilaalmarri
 */
public class DBConnection {
 
    private static Connection conn;  // SINGLE shared connection
 
    private DBConnection() {

         // private constructor prevents creating objects of this class

     }
 
    public static Connection getConnection() throws SQLException {

         String dbURL =

             "jdbc:sqlite:libraryinfo.db";
 
        // If no connection OR connection was closed  create a new one

         if (conn == null || conn.isClosed()) {

             conn = DriverManager.getConnection(dbURL);

         }
 
        return conn;
     }
 }

