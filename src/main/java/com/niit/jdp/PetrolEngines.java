/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class PetrolEngines extends Engines {
    private double displacement;
    private int noOfCylinder;
    
    public PetrolEngines ( ) {
    }
    
    public PetrolEngines ( String modelNumber , double maxPower , double maxRpm ) {
        super ( modelNumber , maxPower , maxRpm );
    }
    
    public double getDisplacement ( ) {
        return displacement;
    }
    
    public void setDisplacement ( double displacement ) {
        this.displacement = displacement;
    }
    
    public int getNoOfCylinder ( ) {
        return noOfCylinder;
    }
    
    public void setNoOfCylinder ( int noOfCylinder ) {
        this.noOfCylinder = noOfCylinder;
    }
}
