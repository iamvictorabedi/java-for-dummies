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
public class Bicycle implements CabornFootPrint  {
    private int noOfKilometers;
    private String type;
    private static Double emission_grams = 5.0;
    
    Bicycle(int noOfKilometers, String type) {
    this.noOfKilometers = noOfKilometers;
    this.type = type;
    }
    
public String getType(){
return this.type;
}

public int getNoOfKilometers(){
return this.noOfKilometers;
}


    
    @Override
    public Double getCarbonFootprint() {
    return (this.noOfKilometers * this.emission_grams);
    }
    
}
