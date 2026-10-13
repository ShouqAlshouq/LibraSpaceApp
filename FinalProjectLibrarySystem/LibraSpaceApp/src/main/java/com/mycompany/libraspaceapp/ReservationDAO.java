package com.mycompany.libraspaceapp;

import java.sql.*;
import java.util.*;

public class ReservationDAO {

    // ============================
    // FIND reservation by ID
    // ============================
    public Reservation findReservationById(String reservationID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM reservation WHERE reservation_id='" + reservationID + "';";
        ResultSet rs = stmt.executeQuery(sql);

        Reservation res = null;

        if (rs.next()) {
            String studentID = rs.getString("student_id");
            String roomID = rs.getString("room_id");
            String reservationDate = rs.getString("reservation_date");
            String status = rs.getString("status");
            String librarian_Id = rs.getString("librarian_Id");

            res = new Reservation(reservationID, studentID, roomID, reservationDate, status, librarian_Id);
        }

        rs.close();
        stmt.close();
        conn.close();

        return res;
    }

    // ============================
    // ADD a new reservation
    // ============================
    public int addNewReservation(String reservationID, String studentID, String roomID, String reservationDate, String status, String librarian_id) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO reservation VALUES('" + reservationID + "','" + studentID + "','" + roomID + "','" + reservationDate + "', '"+status+"', '"+librarian_id+"');";
        System.out.println(sql);

        int insertStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();

        return insertStatus;
    }

    // ============================
    // DELETE reservation
    // ============================
    public int deleteReservation(String reservationID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "DELETE FROM reservation WHERE reservation_id='" + reservationID + "';";
        System.out.println(sql);

        int deleteStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();

        return deleteStatus;
    }

    // ============================
    // GET ALL reservations
    // ============================
    public List<Reservation> getAllReservations() throws SQLException {
        List<Reservation> list = new ArrayList<>();

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM reservation;");

        while (rs.next()) {
            String reservationID = rs.getString("reservation_id");
            String studentID = rs.getString("student_id");
            String roomID = rs.getString("room_id");
            String date = rs.getString("reservation_date");
            String status = rs.getString("status");
            String librarian_id = rs.getString("librarian_id");

            Reservation r = new Reservation(reservationID, studentID, roomID, date, status, librarian_id);
            list.add(r);
        }

        rs.close();
        stmt.close();
        conn.close();

        return list;
    }

    // ============================
    // ROOM FUNCTIONS
    // ============================

    public Room findRoomById(String roomID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM room WHERE room_id='" + roomID + "';";
        ResultSet rs = stmt.executeQuery(sql);

        Room room = null;

        if (rs.next()) {
            String name = rs.getString("room_name");
            int capacity = rs.getInt("capacity");
            String status = rs.getString("status");

            room = new Room(roomID, name, capacity, status);
        }

        rs.close();
        stmt.close();
        conn.close();

        return room;
    }

    public List<Room> getAllRooms() throws SQLException {
        List<Room> rooms = new ArrayList<>();

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM room;");

        while (rs.next()) {
            String roomID = rs.getString("room_id");
            String name = rs.getString("room_name");
            int capacity = rs.getInt("capacity");
            String status = rs.getString("status");

            Room r = new Room(roomID, name, capacity, status);
            rooms.add(r);
        }

        rs.close();
        stmt.close();
        conn.close();

        return rooms;
    }

    public int updateRoomStatus(String roomID, String newStatus) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "UPDATE room SET status='" + newStatus + "' WHERE room_id='" + roomID + "';";
        System.out.println(sql);

        int updateStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();

        return updateStatus;
    }

    List<Reservation> getAllReservation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
