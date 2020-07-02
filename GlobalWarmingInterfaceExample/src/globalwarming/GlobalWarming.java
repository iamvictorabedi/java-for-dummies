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
public class GlobalWarming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CabornFootPrint car = new Car(50, "VW", "1400CC");
        CabornFootPrint building = new Building(100, 5);
        CabornFootPrint bike = new Bicycle(5, "Black mamba");
        
        System.out.println("Car Carbon Footprint = " + car.getCarbonFootprint());
        System.out.println("Building Carbon Footprint = " + building.getCarbonFootprint());
        System.out.println("Bicycle Carbon Footprint = " + bike.getCarbonFootprint());
        //kadenge mark 654290 
        //keith Kyalo 654253 
        //Alex Rugara 657 317 
        //Kennedy Mwenga 658016 
        //Victor Abedi 659265
    }
    
}
