/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Student {
 //Data
   private int snumber;
   private String sname;
    
 public Student( ) {
 
 }
 
  //Methods
    private void getStudent() { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter student number");
    this.snumber = s.nextInt();
    System.out.println("Enter student name");
    this.sname = s.next();
    }
    
   private void display() { 
     System.out.println("Student number = " + this.snumber + " student name = " + this.sname);
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student mystudents[] = new Student[2];
        for(int i = 0; i< 2; i++) {
            mystudents[i] = new Student();
            mystudents[i].getStudent();
            
        }
        
        for(int i = 0; i< 2; i++) {
            mystudents[i].display();
        }
        // TODO code application logic here
    }
    
}
