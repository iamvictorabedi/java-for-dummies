/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsem;

import java.util.Scanner;
import midsem.EMPLOYEE.Title;

/**
 *
 * @author victor
 */
public class EMPLOYEE  extends PERSON{
    /**
     * EMPLOYEE should record and display the job title and number of hours/classes.
     * Staff are paid based on the number of hours while faculty based on the number of classes.
     * An employee’s job title is either staff or faculty.  Make use of enumerated types 
     * to record the job title and enumerated values to record the payment rate. 
     * The payment rate for staff is Ksh1, 000 per hour, while for faculty is Ksh100, 000 per class.
     * 
     */
    private Title title;
    private int noOfHours;
    private int noOfClasses;
    
    private static int Faculty = 100000;
    private static int Staff = 1000;
    
    public EMPLOYEE(final int id_number, final String name, final String telephone,
                    final Title title) {
    super(id_number, name, telephone);
    this.title = title;
    }
    
    public double calculatePaymentRate(){
    double rate;
    if(this.title == Title.faculty){
        //for faculty
    rate = this.noOfClasses * Faculty;
    }
    else {
        //for staff
    rate = this.noOfHours * Staff;
    }
    return rate;
    }
    
    enum Title {
    faculty,
    staff
    }
    
    
    public void display() {   
        System.out.println("Number: "+ id_number);
        System.out.println("Name: "+ name.toString());
        System.out.println("Telephone: "+ telephone.toString());
        System.out.println("Address: "+ address.toString());
        System.out.println("Classes: "+ noOfClasses);
        System.out.println("Hours: "+ noOfHours);
        System.out.println("Address: "+ address.toString());
        System.out.println("Total Pay: "+ calculatePaymentRate());
    
    }
    
    public void getData() {
    Scanner scanner = new Scanner(System.in);
       System.out.println("Enter id number");
    this.id_number = scanner.nextInt();
       System.out.println("Enter name");
    this.name = scanner.next();
           System.out.println("Enter telephone");
    this.telephone = scanner.next();
       System.out.println("Enter no of classes");
    this.noOfHours = scanner.nextInt();
    System.out.println("Enter title");
    this.title = Title.valueOf(scanner.next());
    if(title == Title.faculty){
    System.out.println("Enter no of classes");
    this.noOfClasses = scanner.nextInt();
    }else{
    System.out.println("Enter no of hours");
    this.noOfHours = scanner.nextInt();
    }
    }
}
