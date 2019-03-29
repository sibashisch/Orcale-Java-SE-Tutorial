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
public class LoopControlDemo {
    int initial = 0;
    
    public void demo () {
        System.out.println ("Initial value: " + initial);
        
        System.out.print ("print till the number is < 10 using do-while:\n\t");
        do {
            initial ++;
            System.out.print (initial + " ");
        } while (initial < 10);
        System.out.println ();
        
        initial = 0;
        
        System.out.print ("print till the number is < 10 using while:\n\t");
        while (initial < 10) {
            initial ++;
            System.out.print (initial + " ");
        }
        System.out.println ();
        
        initial = 1;
        
        System.out.print ("Print first 5 natural numbers using for loop:\n\t");
        for (int i=1; i<=5; i++) {
            System.out.print (i + " ");
        }
        System.out.println ();
        
        int [] array = {1,2,3,5,8,13,21,34};
        System.out.print ("Print first few fibanicci numbers from an array:\n\t");
        for (int num:array) {
            System.out.print (num + " ");
        }
        System.out.println ();
        
        // The following demonstrates two special keywords:
        // Print number in infinite loop till answer to the universe is reached!
        // This is a Douglas Adams Joke! Did you get it?
        System.out.print ("Print natural numbers till the answer to the universe (break an infinite loop):\n\t");
        for (int ans = 1;;ans ++) { // Infinite loop, executes forever : Dangerous code, use with caution
            System.out.print (ans + " ");
            if (ans == 42) {
                break; // We break the loop if the answer is reached.
            }
        }
        System.out.println ();
        
        // Next, lets print a first few fibonicci numbers as before. But 13 is unlucky, so skip it
        System.out.print ("Print first few fibanicci numbers but skip unlucky 13:\n\t");
        for (int i=0; i<array.length; i++) {
            if (array[i] == 13) {
                System.out.print ("ahem ");
                continue;
            }
            System.out.print (array[i] + " ");
        }
        System.out.println ();
    }
}
