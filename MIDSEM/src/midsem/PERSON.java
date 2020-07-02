/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsem;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class PERSON {
    public int id_number;
    public String name;
    public String telephone;
    public static String address = "USIU Africa, Off Safari Park";
    
    public PERSON(final int id_number, final String name, final String telephone){
    this.id_number = id_number;
    this.name = name;
    this.telephone = setTelephone(telephone);
    }
    
   public String setTelephone(final String telephone) {
    boolean invalid = true;
    String value = telephone;
    while(invalid) {
        if(value.length() > 13) {
            System.out.println("Invalid Entry try again!!");
            Scanner s = new Scanner(System.in);
            value = s.next();
            invalid = true;
        }
        else {
        invalid = false;
        }
    }
    return telephone;
    }
    
    
}
