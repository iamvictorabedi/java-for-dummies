/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Lesson1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a + b;
        
        System.out.println("Sum of a and b = "+ c);
        areaofRectange();
        areaofCircle();
        
        // TODO code application logic here
    }
    
   private static void areaofRectange(){
       int l = 40; // length
       int w = 50; //width
       int area = l * w; 

       System.out.println("Area of a rectangle =" + area);
     
   }
    
   
      private static void areaofCircle(){
      Scanner s = new Scanner(System.in);
       double pie = 3.142;
       int r = s.nextInt();
       double area = pie * r *r; 
       System.out.println("Area of a circle =" + area);
   }
      
      //Assingment modify program to accept as many score as the user wishes
    private static void getScores(){
        int a [];
      Scanner s = new Scanner(System.in);
       double pie = 3.142;
       int r = s.nextInt();
       double area = pie * r *r; 
       System.out.println("Enter score =" + area);
   }
}
