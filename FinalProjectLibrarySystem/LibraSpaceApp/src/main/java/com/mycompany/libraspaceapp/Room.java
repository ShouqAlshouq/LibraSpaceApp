/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class Room {
    
    private String roomId;
    private String roomName;
    private int capacity;
    private String status;

    public Room(String roomId, String roomName, int capacity, String status) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
        this.status = status;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomName=" + roomName + ", capacity=" + capacity + ", status=" + status + '}';
    }

}
