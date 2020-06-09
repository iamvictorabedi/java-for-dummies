/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerators;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Student {
    private int studentNo;
    private String studentName;
    private Test studentTest;
    
    //Get student data
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student no");
        studentNo = scanner.nextInt();
        System.out.println("Enter student name");
        studentName = scanner.next();
        studentTest = Test.ASSINGMENTS;
    }
    
    //Display student data
    public void display() {
        System.out.println("Student no is " + studentNo + " Student name is " + studentName + " Student test is " + studentTest );
    }
    
    //enums if final imuutable types, they are also static meaning can be shared across the object. 
    //enums values cant be changed
    private enum Test {
    QUIZ_ONE,
    ASSINGMENTS,
    MID_SEM_EXAM,
    FINAL_EXAM}
}
