/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.demoPackage;

/**
 *
 * @author sibashis
 */
public class AccessDemoClassTwo extends AccessDemoClassOne {
    
    public AccessDemoClassTwo () {
        /*
        This is an important feature of the inheritence. The parent class does not have a default 
        */
        super (20);
    }
    
    @Override
    public void printState () {
        // private Field not available here
        System.out.println ("The State is: " + publicField + " " + protectedField + " " + notAccessField);
    }
    
    public void access () {
        // lets try to access the parent's fields
        System.out.println ("Parent's state: parent in same class");
        super.printState();
        System.out.println ("My State (overriden): can't access private");
        this.printState();
        
        AccessDemoClassOne accessClass1 = new AccessDemoClassOne (50);
        System.out.println ("Accessable Fields from a sublass in same package are: " + accessClass1.publicField + " " + accessClass1.protectedField + " " + accessClass1.notAccessField);
        accessClass1.printState();
    }
    
}
