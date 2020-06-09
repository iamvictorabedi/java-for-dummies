/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Registrar {
    private int studentNumber;
    private String studentName;
    private String studentGrade;
    

   public void display() {
   System.out.println("Student name = " + this.studentName + " Student Number = " + this.studentNumber
   + " Student Grade = " + this.studentGrade);
   }
   
   public void getData() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter student number ");
    this.studentNumber = scanner.nextInt() ;
    System.out.println("Enter student name ");
    this.studentName = scanner.next();
    System.out.println("Enter student grade ");
    this.studentGrade = scanner.next();
   }
//   
//   public void setStudentNumber(int studentNumber) {
//   this.studentNumber = studentNumber;
//   }
//   
//   public void setStudentName(String studentName) {
//   this.studentName = studentName;
//   }

   public void setStudentGrade(final String studentGrade) {
   this.studentGrade = studentGrade;
   }
   
   public int getStudentNumber() {
       return this.studentNumber;
   }
   
   public String getStudentName() {
   return this.studentName;
   }
   
   public String getStudentGrade() {
   return this.studentGrade;
   }
       
}
