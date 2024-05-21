/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;




public class Cup  {
    
    private double capacity;
    
    
    
    public Cup() {
    }

    public Cup(double capacity) {
        this.capacity = capacity;
    }

  

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

   


    public double getCapacity() {
        return capacity;
    }
    
    public void receive(int volume, double calories) {
        this.capacity += capacity;
    }


    
    public String getinfo() {
        return "Cup{" + "capacity=" + capacity  + '}';
    }
}



    
    
    

