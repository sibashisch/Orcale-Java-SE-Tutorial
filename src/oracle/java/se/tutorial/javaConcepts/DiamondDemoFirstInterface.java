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
public interface DiamondDemoFirstInterface extends DiamondDemoBaseInterface {
    @Override
    default void printClassName () {
        System.out.println ("DiamondDemoFirstInterface");
    }
    
    void firstFunction();
}
