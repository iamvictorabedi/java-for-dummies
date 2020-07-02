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
public class comemployee extends employee {
    
  private double compensationAmount;
  
  public comemployee(final int no, final String name, double compensationAmount) {
  super(no, name);
  this.compensationAmount = compensationAmount;
  }
    
}
