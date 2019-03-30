/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

import oracle.java.se.tutorial.demoPackage.*;

/**
 *
 * @author sibashis
 */
public class AccessDemo {
    
    /*
    This class makes use of the two classes in demo packega to demonstrate access control in java
    */
    
    public void demo () {
        AccessDemoClassTwo accessClass2 = new AccessDemoClassTwo ();
        accessClass2.access();
        
        AccessDemoClassThree accessClass3 = new AccessDemoClassThree ();
        accessClass3.access();
        
        AccessDemoClassOne accessClass1 = new AccessDemoClassOne (10);
        
        System.out.println ("From unrelated class (neither child nor in same package): only public is accessable");
        System.out.println ("The State is: " + accessClass1.publicField);
        accessClass1.printState();
    }
}
