/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsem;

import midsem.EMPLOYEE.Title;

/**
 *
 * @author victor
 */
public class MIDSEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EMPLOYEE employee = new EMPLOYEE(123, "Mutanu", "254791345044", Title.faculty);
        employee.display();
        STUDENT student = new STUDENT(124, "Abedi", "25423795345", 10, 18, 56);
        student.display();
    }
    
}
