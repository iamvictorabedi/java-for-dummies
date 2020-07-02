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
public class Car implements CabornFootPrint {
  
private int fuelTankSize;
private String model;
private String engineSize;
private static Double emission = 2.62;


Car(int fuelTankSize, String model, String engineSize ) {
this.fuelTankSize = fuelTankSize;
this.model = model;
this.engineSize = engineSize;
}


public String getModel(){
return this.model;
}

public int getFuelTankSize(){
return this.fuelTankSize;
}

public String getEngineSize(){
return this.engineSize;
}
@Override
public Double getCarbonFootprint(){
return ( this.fuelTankSize * emission);
}
}
