/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;

import java.awt.Color;

/*
عمل الطلاب
1 : انس ابراهيم عودة الحروب
2 : بادة ايمن موسى الحوامدة
3 : دان وليد الفسفوس


*/
public  abstract class Ingredient {
    
   
    private int calories;
    private Color color;
   private String name;
   private int volume;
   
    public Ingredient() {
    }

    public  Ingredient(String name,int calories,Color color,int volume) {
       
        this.name = name;
        this.calories = calories;
        this.color=color;
        this.volume=volume;
        
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

  
    public abstract String getInfo();

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    

 
    


}

