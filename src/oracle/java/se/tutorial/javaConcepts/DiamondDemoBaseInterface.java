/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

import oracle.java.se.tutorial.annotations.ModuleInformation;

/**
 *
 * @author sibashis
 */

@ModuleInformation (date="01/06/19")
public interface DiamondDemoBaseInterface {
    
    /*
    We shall override the following function in the interfaces that extends this interface.
    */
    
    default void printClassName () {
        System.out.println ("DiamondDemoBaseInterface");
    } 
    
    default void printRootInterfaceName () {
        System.out.println ("Object --> DiamondDemoBaseInterface");
    }
    
}
