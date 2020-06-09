/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessonencapsulation;

/**
 *
 * @author victor
 */
public class Employee {
    private int enumber;
    private String ename;
    
    public void setEnumber(int enumber) {
        if(enumber > 99 && enumber < 1001) {
        this.enumber = enumber;
        }
        else{
        System.out.println("InvalidNumber!!");
        }
    }
    
    public void setEname( String ename) {
    this.ename = ename;
    }
    
    public String getEname() {
    return this.ename;
    }
    
    public int getEnumber() {
    return enumber;
    }
    
}
