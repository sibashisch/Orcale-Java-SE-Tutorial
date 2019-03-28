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
public interface ClockInterface {
    
    /*
    This is the interface created with the intent of demonstrating the workings of a basic interace.
    This interface enforces any class that implements this interface to have these two basic functionalities any clock
    must have.
    */
    
    public void setTime (String time);
    public void sayTime ();
}
