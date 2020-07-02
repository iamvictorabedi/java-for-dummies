/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsem;

import java.util.Scanner;
import static midsem.PERSON.address;

/**
 *
 * @author victor
 */
public class STUDENT extends PERSON{
    /**
     * Class STUDENT should record and display a student’s quiz, midterm and final exam scores
     * . These scores should not exceed 50%, 20% and 30% respectively.  
     */
    private int quiz;
    private int midterm;
    private int finalExam;
    private Scanner scanner = new Scanner(System.in);
    
    public STUDENT(final int id_number, final String name, final String telephone,
            final int quiz, final int midterm, final int finalExam) {
        super(id_number, name, telephone);
        this.quiz = setQuiz(quiz);
        this.midterm = setMidterm(midterm);
        this.finalExam = setFinalExam(finalExam);
        
}
    
    public int setQuiz(final int quiz) {
        boolean invalid = true;
        int newatempt;
        newatempt = quiz;
        while(invalid){
        if(newatempt > 50) {
        System.out.println("Invalid Entry. Quiz cant exeeced 50%. Enter new quiz");
        newatempt = scanner.nextInt();
        }
        else{
        invalid = false;
        }
    }
        return newatempt;  
    }
    
    
    public int setMidterm(final int midterm) {
        boolean invalid = true;
        int newatempt;
        newatempt = midterm;
        while(invalid){
        if(newatempt > 20) {
        System.out.println("Invalid Entry. Midterm cant exeeced 20%. Enter new midterm");
        newatempt = scanner.nextInt();
        }
        else{
        invalid = false;
        }
    }
        return newatempt;  
    }
        
     public int setFinalExam(final int finalExam) {
        boolean invalid = true;
        int newatempt;
        newatempt = finalExam;
        while(invalid){
        if(newatempt > 30) {
        System.out.println("Invalid Entry. Final Exam cant exeeced 30%. Enter new final exam");
        newatempt = scanner.nextInt();
        }
        else{
        invalid = false;
        }
    }
        return newatempt;  
    }

     
       public void display() {   
        System.out.println("Number: "+ id_number);
        System.out.println("Name: "+ name.toString());
        System.out.println("Telephone: "+ telephone.toString());
        System.out.println("Address: "+ address.toString());
        System.out.println("Quiz: "+ this.quiz);
        System.out.println("Mid: "+ this.midterm);
        System.out.println("Final: "+ this.finalExam);
        int score = this.quiz + this.midterm + this.finalExam;
        System.out.println("Total Score:  "+ score);
    
    }
    
    public void getData() {
    Scanner scanner = new Scanner(System.in);
           System.out.println("Enter id number");
    this.id_number = scanner.nextInt();
           System.out.println("Enter name");
    this.name = scanner.next();
           System.out.println("Enter telephone");
    this.telephone = scanner.next();
           System.out.println("Enter final Exam");
    this.finalExam = scanner.nextInt();
       System.out.println("Enter quiz");
    this.quiz = scanner.nextInt();
       System.out.println("Enter midsem");
    this.midterm = scanner.nextInt();
           System.out.println("Enter final Exam");
    this.finalExam = scanner.nextInt();
    }
      
}
