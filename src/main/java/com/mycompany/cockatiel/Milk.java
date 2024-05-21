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

هذا البروجيكت قيد التعديل
وتم تسليم الامور الاساسية المطلوبة في الجزء الاول
وفي القسم الثاني سوف تكون جميع الكلاسات بدون اي مشاكل
وسبب المشاكل والايرور هو عدم اكتمال المشروع


*/
public class Milk extends Ingredient {

    public Milk(String name, int calories,  int volume,Color color){
        super(name, calories, color, volume);
    }

    
    

    
     

   

   
    

   
    @Override
    public String getInfo() {
        
        String ss="milk name is "+this.getName()+"\n"+"caloris :"+this.getCalories()+"\n"+"the volum is :"+this.getVolume();
        
        return ss;
    }

   

    
   
    
    
    
}


