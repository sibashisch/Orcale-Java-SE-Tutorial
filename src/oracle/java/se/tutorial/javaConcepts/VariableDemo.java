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
public class VariableDemo {
    /*
    This class is used to demonstrate the different variable types.
    */
    
    public void demo () {
        System.out.println ("Careating one object");
        VariableDemoClass variableDemoClass = new VariableDemoClass ();
        variableDemoClass.printState();
        
        // Now create a new object
        VariableDemoClass variableDemoClass2 = new VariableDemoClass ();
        // Change the value if the class variable in this new object
        variableDemoClass2.classVariable = 5; // ideally, should be accessed as: VariableDemoClass.classVariable
        // Also, Change the character variable also in the new class
        variableDemoClass2.character = 'd';
        
        // Print state of the first obeject again, check the instance variable is unchanged but the class variable
        // value is changed.
        System.out.println ("\nAfter changing variable values in a different object of same class:\n");
        variableDemoClass.printState();
                
    }
}
