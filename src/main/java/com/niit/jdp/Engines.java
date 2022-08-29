/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class Engines {
    private String modelNumber;
    private double maxPower;
    private double maxRpm;
    
    public Engines ( ) {
    }
    
    public Engines ( String modelNumber , double maxPower , double maxRpm ) {
        this.modelNumber = modelNumber;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
    }
    
}
