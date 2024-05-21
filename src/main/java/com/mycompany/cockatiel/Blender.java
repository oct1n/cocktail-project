/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;
import java.awt.Color;

import java.util.ArrayList;




public class Blender {
    
   
  ArrayList <Ingredient> Ingredient;
  private int capacity;
  private double calories; 
  private Color color;
  private int volume;

    public Blender(int par, Logger logger) {
    }

    public Blender(ArrayList<Ingredient> Ingredient, int capacity, double calories, Color color) {
        this.Ingredient = Ingredient;
        this.capacity = capacity;
        this.calories = calories;
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }



    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
  
  
    
  
  
  
  
  public void addingredient (Ingredient e) throws BlenderOverflowException
  {
      if(this.volume==this.capacity)
          throw new BlenderOverflowException("blender is overflow");
      System.out.println("add name the ingredient : ");
      Ingredient.add(e);
      
      
  }
  
  
 
 public Cocktail blend() throws BlenderOverflowException, BlenderEmptyException {
    Color da = null; // Initialize da
     int totalVolume=0;
    if (Ingredient.isEmpty()) throw new BlenderEmptyException("Blender is empty");
    if (volume > capacity) throw new BlenderOverflowException("Blender overflow");
    // Blending logic
    for (Ingredient ingredient : Ingredient) {
        if (ingredient instanceof Fruit) {
            da = ((Fruit) ingredient).getColor(); 
            totalVolume=+ingredient.getVolume();
        }
    }
    return new Cocktail(calories, Ingredient,da ,totalVolume);
}
    

       public void pour(Cup cup, int volume) throws BlenderEmptyException {
        if (this.volume == 0) {
            throw new BlenderEmptyException("Blender is empty.");
        }
        cup.receive(volume, calories); 
        this.volume -= volume;
    }
  


  
    public String getinfo() {
        return "Blender{" + "Ingredient=" + Ingredient + ", capacity=" + capacity + ", calories=" + calories + ", color=" + color + ", volume=" + volume + '}';
    }
}

