/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalwarming;

/**
 *
 * @author victor
 */
public class Building implements CabornFootPrint {

private int noOfFloors;
private int amountOfNaturalGas;
private static Double factor = 11.7;


Building(int noOfFloors, int amountOfNaturalGas) {
this.amountOfNaturalGas = amountOfNaturalGas;
this.noOfFloors = noOfFloors;
}


public int getNoOfFloors(){
return this.noOfFloors;
}

public int getAmountOfNaturalGas(){
return this.amountOfNaturalGas;
}

@Override
public Double getCarbonFootprint() {
return (this.amountOfNaturalGas * this.factor);
}

}
