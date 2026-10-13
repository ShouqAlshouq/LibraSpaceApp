package com.mycompany.libraspaceapp;

import java.sql.*;
import java.util.*;

public class RoomDAO {

    // ============================
    // FIND ROOM BY ID
    // ============================
    public Room findRoomById(String roomID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM room WHERE room_id='" + roomID + "';";
        ResultSet rs = stmt.executeQuery(sql);

        Room room = null;

        if (rs.next()) {
            String roomName = rs.getString("room_name");
            int capacity = rs.getInt("capacity");
            String status = rs.getString("status");

            room = new Room(roomID, roomName, capacity, status);
        }

        rs.close();
        stmt.close();
        conn.close();
        return room;
    }

    // ============================
    // ADD NEW ROOM
    // ============================
    public int addNewRoom(String roomID, String roomName, int capacity, String status) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO room VALUES('" + roomID + "','" + roomName + "'," + capacity + ",'" + status + "');";
        System.out.println(sql);

        int insertStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
        return insertStatus;
    }

    // ============================
    // UPDATE ROOM
    // ============================
    public int updateRoom(String roomID, String roomName, int capacity, String status) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "UPDATE room SET room_name='" + roomName 
                   + "', capacity=" + capacity 
                   + ", status='" + status 
                   + "' WHERE room_id='" + roomID + "';";

        System.out.println(sql);
        int updateStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
        return updateStatus;
    }

    // ============================
    // DELETE ROOM
    // ============================
    public int deleteRoom(String roomID) throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();

        String sql = "DELETE FROM room WHERE room_id='" + roomID + "';";
        System.out.println(sql);

        int deleteStatus = stmt.executeUpdate(sql);

        stmt.close();
        conn.close();
        return deleteStatus;
    }

    // ============================
    // GET ALL ROOMS
    // ============================
    public List<Room> getAllRooms() throws SQLException {
        List<Room> list = new ArrayList<>();

        Connection conn = DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM room;");

        while (rs.next()) {

            String roomID = rs.getString("room_id");
            String roomName = rs.getString("room_name");
            int capacity = rs.getInt("capacity");
            String status = rs.getString("status");

            Room r = new Room(roomID, roomName, capacity, status);
            list.add(r);
        }

        rs.close();
        stmt.close();
        conn.close();
        return list;
    }
}
