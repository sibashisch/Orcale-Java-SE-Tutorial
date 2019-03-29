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
public class ArrayDemo {
    /*
    This class demonstrate an array, a non-primitive datatype that can store multiple variables of same type.
    The Array ensures contiguous memory allocation making access very fast.
    Also, array variables can be accessed using indices, making the access to be O(1) operation.
    You may think it to be indication of being very fast, it big-O notation is not known to you.
    */
 
    public void demo () {
        // Array can be of any type (even non primitive); We are using integer array in this demo
        int [] exampleArray = new int [10]; // The array is declared only
        int [] anotherExampleArray = {1,2,3,4,5}; // Declared and values assigned

        // We need to assign values in our first array (to do so, we are using a for loop that will be demonstrated later)
        for (int i=0; i<10; i++) {
            exampleArray[i] = 100 + i;
        }
        
        System.out.println ("Example 1: " + exampleArray); 
        System.out.println ("Example 2: " + anotherExampleArray);
        System.out.println ("See, arrays cannot be printed as they are, instead this thing called a hashcode is what gets printed\n");
        System.out.println ("The 5-th element in first array is: " + exampleArray[4]); // remembere, arrays are 0 indexed
        System.out.println ("The 2-nd element in second array is: " + anotherExampleArray[1]);
        System.out.println ("Number of elements in first array: " + exampleArray.length);
        System.out.println ("The last element in second array is: " + anotherExampleArray[anotherExampleArray.length - 1]);
    }
}
