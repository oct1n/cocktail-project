/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cockatiel;
import java.awt.Color;

import java.util.ArrayList;


public class Cocktail {

    public Cocktail(ArrayList<Ingredient> Ingredient1, Color color1) {
    }
    
    private double calories;
    private  ArrayList <Ingredient> Ingredient;
    private Color color;
    private int volume;

    public double getCalories() {
        return calories;
    }

    public Cocktail(double calories, ArrayList<Ingredient> Ingredient, Color color,int volume) {
        this.calories = calories;
        this.Ingredient = Ingredient;
        this.color = color;
        this.volume=volume;
    }

    
    
    public void setCalories(double calories) {
        this.calories = calories;
    }

    public ArrayList<Ingredient> getIngredient() {
        return Ingredient;
    }

    public void setIngredient(ArrayList<Ingredient> Ingredient) {
        this.Ingredient = Ingredient;
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
    
    

    @Override
    public String toString() {
        return "Cocktail{" + "calories=" + calories + ", Ingredient=" + Ingredient + ", color=" + color + '}';
    }
    
    
}


