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
public class MethodDemo {
    /*
    This class makes use of House class to demonstrate the behaviors of methods.
    */
    
    public void demo () {
        // Instead of calling the default constructor, we use the overrriden constructor here
        House house = new House(2, 3, 12, 900, "51 DPP Road, Kolkata 78");

        // Let's make use of the getters to print some of the properties of the house
        System.out.println ("Number of Rooms: " + house.getRooms() + " and area is: " + house.getArea());
        System.out.println ("Address: " + house.getAddress());
        
        // Now, let's update the address
        house.setAddress("25C","Shakespeare", "Sarani", "Kolkata", "700017");
        System.out.println ("Updated Address: " + house.getAddress());
        
        // Let's change the age twice using two versions of the method
        house.setAge(15);
        System.out.println ("Age after first update: " + house.getAge());
        house.setAge(1, 8);
        System.out.println ("Age after second update: " + house.getAge());
    }
}
