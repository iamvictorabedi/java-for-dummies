/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsoop;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ObjectsOOP {
    //Data
   private int snumber;
   private String sname;
    
 public ObjectsOOP(int snumber, String sname ) {
 this.snumber = snumber;
 this.sname = sname;
 }
 
 
  public ObjectsOOP() { }
    
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
        ObjectsOOP studentA = new ObjectsOOP();
        ObjectsOOP studentB = new ObjectsOOP();
        studentA.getStudent();
        studentA.display();
        studentB.getStudent();
        studentB.display();
    }

    
}
