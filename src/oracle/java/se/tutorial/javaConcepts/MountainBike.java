/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

/**
 *
 * @author sibashis
 */
public class MountainBike extends Bicycle {
    
    /*
    This class demonstrates inheritance; This is a subclass of Bicycle. So by default all public 
    attributes of Bicycle are also present for MountainBike as well.
    This also overrides a method of the superclass and uses something called an annotation. These topics 
    are covered later.
    */
    
    double gearRatio = 1.0;
    
    void changeGearRatio (double gearRatio) {
        this.gearRatio = gearRatio;
    }
    
    @Override
    void printStates() {
         System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " gear ratio:" + gearRatio);
    }
    
}
