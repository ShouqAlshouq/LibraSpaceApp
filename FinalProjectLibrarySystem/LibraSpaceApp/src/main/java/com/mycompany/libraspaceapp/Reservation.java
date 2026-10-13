/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class Reservation {
    
    private String reservation_id;
    private String student_id;
    private String room_id;
    private String reservation_date;
    private String status;
    private String librarian_Id;

    public Reservation() {
    }

    public Reservation(String reservation_id, String student_id, String room_id, String reservation_date, String status, String librarian_Id) {
        this.reservation_id = reservation_id;
        this.student_id = student_id;
        this.room_id = room_id;
        this.reservation_date = reservation_date;
        this.status = status;
        this.librarian_Id = librarian_Id;
    }



    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_id() {
        return student_id;
    }
    
    public String getReservation_Id() {
        return reservation_id;
    }

    public String getRoom_Id() {
        return room_id;
    }

    public String getReservation_date() {
        return reservation_date;
    }
    public void setReservation_Id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    public void setRoom_Id(String room_id) {
        this.room_id = room_id;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public String getStatus() {
        return status;
    }

    public String getLibrarian_Id() {
        return librarian_Id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLibrarian_Id(String librarian_Id) {
        this.librarian_Id = librarian_Id;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reservation_id=" + reservation_id + ", student_id=" + student_id + ", room_id=" + room_id + ", reservation_date=" + reservation_date + ", status=" + status + ", librarian_Id=" + librarian_Id + '}';
    }

   
}
