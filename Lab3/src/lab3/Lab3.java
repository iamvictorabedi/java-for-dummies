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
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Registrar registrar = new Registrar(); 
    registrar.getData();
    registrar.display();

    System.out.println("I am a :  \n 1. Registrar \n 2. Student"
            + "\n 3. Faculty");
    int option = scanner.nextInt();
 
    switch(option) {
        case 1:
            System.out.println("Displaying Student: ReadOnly");
            registrar.display();
            break;
        case 2:
            System.out.println("Displaying Student : Read Only");
            Student student = new Student();
            student.displayStudent(registrar);
            break;
        case 3:
            System.out.println("Display / Edit Grade Rights");
            Faculty faculty = new Faculty();
            faculty.display(registrar);
            break;
        default:
             System.out.println("Invalid input");
             break;  
    }
    }   
}
