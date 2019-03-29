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
public class OperatorDemo {
    
    /*
    This class demonstrates use of basic operators.
    */
    
    int numberOne = 8;
    int numberTwo = 5;
    
    String str1 = "James";
    String str2 = "Bond";
    
    public void demo () {
        // Binary Arithmatic Operators
        System.out.println ("Number 1: " + numberOne + "; Number 2: " + numberTwo);
        System.out.println ("Addition: " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        System.out.println ("Subtraction: " + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        System.out.println ("Multiplication: " + numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
        System.out.println ("Integer Division: " + numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
        System.out.println ("Mod: " + numberOne + " % " + numberTwo + " = " + (numberOne % numberTwo));
        System.out.println ("Real Number Division: " + numberOne + " / " + numberTwo + " = " + ((double)numberOne / (double)numberTwo));
        
        // Unary Arithmatic Operators
        System.out.println ("Pre-Increment: Bef =  " + numberOne + " During = " + (++numberOne) + " Aft = " + numberOne);
        System.out.println ("Post-Increment: Bef =  " + numberOne + " During = " + (numberOne++) + " Aft = " + numberOne);
        System.out.println ("Negation: -" + numberTwo + " = " + (-numberTwo));
        
        // Relationl operators
        System.out.println ("Relational (Greater): " + numberOne + ">" + numberTwo + "? " + (numberOne>numberTwo)); 
        System.out.println ("Relational (Less Equal): " + numberOne + "<=" + numberTwo + "? " + (numberOne<=numberTwo));
        System.out.println ("Relational (Equality): " + numberOne + "=" + numberTwo + "? " + (numberOne==numberTwo));
        System.out.println ("Relational (Inequility): " + numberOne + "!=" + numberTwo + "? " + (numberOne!=numberTwo));
        
        // String concat 
        System.out.println ("Addition works on strings as well: " + str1 + " + " + str2 + " = " + (str1 + str2));
        
        // Instanceof
        System.out.println ("Instanceof: str1 is an instance of a subclass of Object? " + (str1 instanceof Object));
        
        // Ternary Operator
        System.out.println ("Ternary Opeator: (" + numberOne + ">=" + numberTwo + ")?\"GE\":\"Not-GE\" = " + ((numberOne >= numberTwo)?"GE":"Not-GE"));
        
        // Bitwise shift and logical
        System.out.println ("Bitwise Left Shift: " + numberTwo + " << 2 = " + (numberTwo << 2));
        System.out.println ("Bitwise Right Shift: " + numberOne + " >> 1 = " + (numberOne >> 1));
        System.out.println ("Bitwise OR: " + numberOne + "(" + Integer.toBinaryString(numberOne) + ") | " + numberTwo + " (" + Integer.toBinaryString(numberTwo) + ") = " + (numberOne | numberTwo) + "(" + Integer.toBinaryString(numberOne | numberTwo) + ")");
        System.out.println ("Bitwise AND: " + numberOne + "(" + Integer.toBinaryString(numberOne) + ") & " + numberTwo + " (" + Integer.toBinaryString(numberTwo) + ") = " + (numberOne & numberTwo) + "(" + Integer.toBinaryString(numberOne & numberTwo) + ")");
        System.out.println ("Bitwise XOR: " + numberOne + "(" + Integer.toBinaryString(numberOne) + ") ^ " + numberTwo + " (" + Integer.toBinaryString(numberTwo) + ") = " + (numberOne ^ numberTwo) + "(" + Integer.toBinaryString(numberOne ^ numberTwo) + ")");
    }
    
}
