/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;

/**
 *
 * @author MSI
 */
public class MyLogger implements Logger {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}