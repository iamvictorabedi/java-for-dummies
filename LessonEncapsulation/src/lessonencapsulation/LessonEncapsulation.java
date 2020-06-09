/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonencapsulation;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class LessonEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Employee employee = new Employee();
       System.out.println("Enter Employee name");
       employee.setEname(s.next());
       System.out.println("Enter Employee number");
       employee.setEnumber(s.nextInt());
       System.out.println("You entered Employee name  " + employee.getEname() + " " + "Employee Number  "+ employee.getEnumber() );

     

    }
    
}
