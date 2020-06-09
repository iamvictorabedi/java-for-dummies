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
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[5];
        
       
                for(int i = 0; i < 5; i ++) {
                System.out.println("Enter student name");
                //storage of student
                students[i] = scanner.next();
                }
                
                display(students);
                
                //call two dimetional array
                TwoDimentionArray tda = new TwoDimentionArray();
                tda.getData();
                
    }
    
    
   private static void display(String[] students) {
       
        for(int i = 1; i < 5; i ++) {
                    //printing student at stored position
                System.out.println("student name  at position " + i + " = " + students[i]);
        }
        
   }
    
}
