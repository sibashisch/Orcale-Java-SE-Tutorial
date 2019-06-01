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
public interface ClockInterface {
    
    /*
    This is the interface created with the intent of demonstrating the workings of a basic interace.
    This interface enforces any class that implements this interface to have these two basic functionalities any clock
    must have.
    */

    /**
     *
     * @param time
     */

    
    public void setTime (String time);
    public void sayTime ();
    
    /*
    long after this interface is made public, we have decided that our clocks must tell dates as well.
    To achieve that, we must define two new mothods. But doing so will break our project as none of the classes
    that implement this interface have those functions defined.
    Java 8 onwards we have a way to achieve this by defining default implementations of the functions written in 
    the interface.
    */
    @ModuleInformation (date="01/04/19")
    default void setDate (String date){
        System.out.println ("Default Set Date function");
    }
    
    @ModuleInformation (date="01/04/19")
    default void sayDate (String date){
        System.out.println ("Default Say Date function");
    }
}
