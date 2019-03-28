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
public class AlarmClock implements ClockInterface {
    
    /* This class implements the ClockInterface interface. So, this class must define all the methods mentioned in the
    interface. Additonally, it may contain its own methods and fields.
    */
    
    String time = "12:00";

    @Override
    public void setTime(String time) {
        this.time = time;
    }
    
    @Override
    public void sayTime () {
        System.out.println ("Time: " + time);
    }
    
    public void alarm () {
        System.out.println ("Trring Trring Trrring!");
    }
    
}
