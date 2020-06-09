/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class students {
    private int snumber;
    private String sname;
    
 public void getData() {
 System.out.println("student number = " + snumber);
 System.out.println("student name = " + sname);
 }
 
 public void display() {
 Scanner s = new Scanner(System.in);
 System.out.println("Enter student no");
 snumber = s.nextInt();
 System.out.println("Enter student name");
 sname = s.next(); 
 }
}
