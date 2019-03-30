/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

import oracle.java.se.tutorial.demoPackage.AccessDemoClassOne;

/**
 *
 * @author sibashis
 */
public class AccessDemoClassThree extends AccessDemoClassOne {
    public AccessDemoClassThree () {
        /*
        This is an important feature of the inheritence. The parent class does not have a default 
        */
        super (30);
    }
    
    @Override
    public void printState () {
        // private Field not available here
        System.out.println ("The State is: " + publicField + " " + protectedField);
    }
    
    public void access () {
        // lets try to access the parent's fields
        System.out.println ("Parent's state: parent in different package");
        super.printState();
        System.out.println ("My State (overriden): can't access private or no access mentioned variables");
        this.printState();
        
        AccessDemoClassOne accessClass1 = new AccessDemoClassOne (40);
        System.out.println ("Accessable Fields from a sublass in different package are: " + accessClass1.publicField);
        accessClass1.printState();
    }
}
