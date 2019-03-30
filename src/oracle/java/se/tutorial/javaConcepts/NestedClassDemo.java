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
public class NestedClassDemo {
    /*
    In this class few shall create few objects of the NetsetClassDemoClass class to demonstrate the
    use and shadowing effect of nested class
    */
    
    public void demo () {
        NetsetClassDemoClass obj1 = new NetsetClassDemoClass (10);
        NetsetClassDemoClass obj2 = new NetsetClassDemoClass (20);
        
        // Now to demonstrate the shadowing effect print the state.
        // Please go and check in the definition of this function how the access is got.
        obj1.printState(0);
        obj2.printState(1);
    }
}
