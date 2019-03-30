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
public class Bicycle {
    
    /*
    This code demonstrates the basic componets of a class (i.e. fields and methods)
    */
    
    // These are fields
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    // These are methods
    
    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
    
}
