/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraspaceapp;

/**
 *
 * @author jamilaalmarri
 */
public class MyList <T>{
    public int index;
    public int size;
    public Object[] tList;
    
    public MyList(int size){
        tList = new Object[size];
        index = 0;
    }
    
    public void add(T t){
        tList[index++] = (Object)t;
    }
    
    public T get(int i){
        return (T)tList[i];
    }
}
