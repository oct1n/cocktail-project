/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;


public class FileLogger implements Logger {

    public FileLogger(String loggerlog) {
    }
    public void log(String message) {
        // Log to a file (pseudo code)
        System.out.println("File Log: " + message);
    }
}