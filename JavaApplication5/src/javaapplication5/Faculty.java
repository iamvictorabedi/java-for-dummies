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
public class Faculty {
    private int score;
    public void display() {
    System.out.println("student score is = " + score);
    }
    
    public void grade(students st) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student score");
        score = s.nextInt();
        st.display();
        
        if(score > 59) {
                System.out.println("student grade is PASS");

        }else {
                System.out.println("student grade is FAIL");

        }

    }
    
}
