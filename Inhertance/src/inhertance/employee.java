/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhertance;

/**
 *
 * @author victor
 */
public class employee {
    private int no;
    private String name;
    
    public employee(int no, String name) {
    this.name = name;
    this.no = no;
    }
    
    private int setNo(final int no){
        return no;
    }
    
    
    private String setName(final String name){
        return name;
    }
    
}
