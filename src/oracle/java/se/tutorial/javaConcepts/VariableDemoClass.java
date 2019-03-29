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
public class VariableDemoClass {
    /*
    This class is used to demonstrate the different variable types.
    */
    
    // The different primitive types of variables are: (instance variables)
    int actualByte = 257; // Used to demo the capacity of byte type
    byte integer8bit = (byte)actualByte;
    short integer16bit = 12345;
    int integer32bit = 123456;
    long integer64bit = 1234567;
    float floatingPoint = (float)1/(float)3;
    double doublePrecision = (double)1/(double)3;
    boolean booleanLiteral = true;
    char character = 'a';
    
    // one class variable
    static int classVariable = 0;
    
    // The function that prints the state (i.e.values of the fields) of the object
    public void printState () {
        System.out.println (actualByte + " was assigned to byte, became: " + integer8bit + " (capacity issue)");
        System.out.println ("short, int and long are: " + integer16bit + " " + integer32bit + " and " + integer64bit);
        System.out.println ("1/3 as float is: " + floatingPoint + " and as double: " + doublePrecision);
        System.out.println ("boolean literal is: " + booleanLiteral + " the character example is: " + character);
        System.out.println ("Finally, current value of the class variable is: " + classVariable);
    }
    
}
