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
public class InheritanceDemo {
    /*
    This class uses the "MountainBike" class to demonstrate inheritance.
    Here We will call methods from Bicycle class that are not defined in MountainBike class (available from the superclass
    i.e. Bicycle) and also see how a function is overriden in the subclass.
    */
    
    public void mountainBikeDemo () {

        // Instantiate a MountainBike object
        MountainBike mountainBike = new MountainBike();

        // Call methods on it
        mountainBike.speedUp(5);
        mountainBike.changeCadence(25);
        mountainBike.changeGearRatio(.8);
        mountainBike.printStates();
            
    }
}
