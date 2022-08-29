/*
 * Author Name: Mohit Saini
 * Date: 29-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class CngEngines extends Engines {
    private String typeOfCNG;
    
    public CngEngines ( String typeOfCNG ) {
        this.typeOfCNG = typeOfCNG;
    }
    
    public CngEngines ( String modelNumber , double maxPower , double maxRpm , String typeOfCNG ) {
        super ( modelNumber , maxPower , maxRpm );
        this.typeOfCNG = typeOfCNG;
    }
}
