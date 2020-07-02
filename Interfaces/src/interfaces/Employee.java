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
public class Employee implements payable {
    String name;
    int noOfHours;
    Double salary;
    int number;
    Double sale;
    Double rate;
    
    Employee(String name, int noOfHours, Double salary, int number, Double sale, Double rate) {
    this.name = name;
    this.noOfHours = noOfHours;
    this.salary = salary;
    this.number = number;
    this.sale = sale;
    this.rate = rate;
    }
    
    public String getName(){
    return this.name;
    }
    
    public int getNumber(){
    return this.number;
    }
    
    public Double getSalary(){
    return this.salary;
    }
    
    public int getNoOfHours(){
    return this.noOfHours;
    }
    
    public Double getRate(){
    return this.rate;
    }
    
    public Double getSale(){
    return this.sale;
    }
    
    @Override
    public Double getamount(){
    return salary + (sale * rate);
    }
}
