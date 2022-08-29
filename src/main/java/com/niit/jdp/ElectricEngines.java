/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class ElectricEngines extends Engines {
    private double voltages;
    
    public ElectricEngines ( double voltages ) {
        this.voltages = voltages;
    }
    
    public ElectricEngines ( String modelNumber , double maxPower , double maxRpm , double voltages ) {
        super ( modelNumber , maxPower , maxRpm );
        this.voltages = voltages;
    }
    
}
