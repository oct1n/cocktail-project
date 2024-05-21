/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;
//import java.awt.Color;

import java.awt.Color;






public  class Fruit extends Ingredient {


    public Fruit() {
        
    }

    public Fruit(String name, int calories,  int volume,Color color) {
        super(name, calories, color, volume);
    }

   

    

    

    
  




  @Override
    public String getInfo() {
String str ="name:   "+this.getName()+"\n"+"caloris :"+this.getCalories()+"\n"+"the volum is :"+this.getVolume();
        
        return str;
             }

   

    

    
   

    
 
    
    





    
   
    
   
}
    


