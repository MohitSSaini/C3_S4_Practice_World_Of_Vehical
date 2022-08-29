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
    
    public String getModelNumber ( ) {
        return modelNumber;
    }
    
    public void setModelNumber ( String modelNumber ) {
        this.modelNumber = modelNumber;
    }
    
    public double getMaxPower ( ) {
        return maxPower;
    }
    
    public void setMaxPower ( double maxPower ) {
        this.maxPower = maxPower;
    }
    
    public double getMaxRpm ( ) {
        return maxRpm;
    }
    
    public void setMaxRpm ( double maxRpm ) {
        this.maxRpm = maxRpm;
    }
    
}
