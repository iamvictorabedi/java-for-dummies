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
public class Faculty {
    Scanner scanner = new Scanner(System.in);

   public void display(Registrar registrar) {
   System.out.println("Student name = " + registrar.getStudentName() + " Student Number = " + registrar.getStudentNumber()
   + " Student Grade = " + registrar.getStudentGrade());
   System.out.println(" Do you wish to moify student grade?  Y  / N");
    String option = scanner.next();
    switch(option){
        case "Y":
         editGrade(registrar);
         break;
        case "N":
            break;
        default:
          System.out.println("Invalid Input");
          break;

    }
    }
    
    public void editGrade(Registrar registrar) {
    System.out.println("Enter new Grade");
    registrar.setStudentGrade(scanner.next());
    registrar.display();
    }

}
