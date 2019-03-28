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
public class InterfaceDemo {
    
    /*
    This class makes use of the AlarmClock class that implements the ClockInterface interface to demonstrate 
    the use of interfaces and how it should be implemented.
    */
    
    public void alarmClockDemo () {
        
        AlarmClock alarmClock = new AlarmClock ();
        alarmClock.setTime("14:00");
        alarmClock.sayTime();
        alarmClock.alarm();
    
    }
}
