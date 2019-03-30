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
public class AccessDemoClassOne {
    /*
    This class will be used to demonstrate the access modifiers.
    */
    
    // We define fields with different levels of access modifires
    public int publicField;
    protected int protectedField;
    int notAccessField;
    private int privateField;
    
    public AccessDemoClassOne (int a) {
        publicField = a + 1;
        protectedField = a + 2;
        notAccessField = a + 3;
        privateField = a + 4;
    }
    
    public void printState () {
        System.out.println ("The State is: " + publicField + " " + protectedField + " " + notAccessField + " " + privateField);
    }
    
    public void setPrivate (int x) {
        this.privateField = x;
    }
}
