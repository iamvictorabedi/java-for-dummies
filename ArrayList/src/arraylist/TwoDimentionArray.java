/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class TwoDimentionArray {
    
    private final String [] [] students = new String [5] [3];
    private final Scanner scanner = new Scanner(System.in);
    
    public void getData(){
        
       for(int r = 0; r < 5; r++){
        for(int c= 0; c < 3; c++) {
         students[r] [c] = scanner.nextLine().trim();
        }
       }
       
       display(students);
       
    }
    
    public void display(String [] [] students) {
    System.out.println("Student Name    Test 1   Test 2  Test 3");
       for(int r = 0; r < 5; r++){
        for(int c= 0; c < 3; c++) {
    System.out.println(students[r] [c]);
        }
       }
    }
    
}
