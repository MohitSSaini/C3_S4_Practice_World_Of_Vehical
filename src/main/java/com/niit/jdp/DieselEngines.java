/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class DieselEngines extends Engines {
    private String typeOfFuel;
    
    public DieselEngines ( String typeOfFuel ) {
        this.typeOfFuel = typeOfFuel;
    }
    
    public DieselEngines ( String modelNumber , double maxPower , double maxRpm , String typeOfFuel ) {
        super ( modelNumber , maxPower , maxRpm );
        this.typeOfFuel = typeOfFuel;
    }
    
    public String getTypeOfFuel ( ) {
        return typeOfFuel;
    }
    
    public void setTypeOfFuel ( String typeOfFuel ) {
        this.typeOfFuel = typeOfFuel;
    }
    
}
