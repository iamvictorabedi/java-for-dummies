/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author victor
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        payable mypay = new Employee("Tom", 8, 5000.0, 8, 8.0, 8.0 );
        System.out.println("Your pay = " + mypay.getamount());
    }
    
}
