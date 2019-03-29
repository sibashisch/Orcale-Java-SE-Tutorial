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
public class BranchDemo {
    /*
    This class demonstrates the use of branch statement to condtionally determinig the execution flow.
    */
    
    int percentage = 81;
    int numSupply = 0;
    
    String division = "";
    
    public void demo () {
        // We will try to determine the result of a candidate based on percentage and number of supplimentory
        // exams he/she had to appear on.
        // The logic is: <50% = fail, 50%-75% = second, >=75% = first. if > 75% and no suppli then Hons is conferred.
        
        if (percentage < 50) {
            division = "fail";
        } else if (percentage >= 50 && percentage <75) { // This is a compound condition that uses the logical and operator
            division = "second";
        } else {
            
            // This is called a nested condition
            if (numSupply == 0) {
                division = "first (Hons.)";
            } else {
                division = "first";
            }
        }
        
        System.out.println ("Marks = " + percentage + "%, number of supplies = " + numSupply + "; Result = " + division);
        
        // For variables that have List of Values (i.e. they are not continuous), can be used in a switch statement as follow:
        // Here we will try to determine the prize money based on the division.
        
        int prize = 0;
        switch (division) { // Switch on string was introduced in Java 7 only; before that only int, double etc. could be used
            case "first (Hons.)": prize = 500; break; 
            case "first": prize = 400; break;
            case "second": prize = 300; break;
            case "fail": prize = 200; break;
            default: prize = 0;
        }
        // We use break afetr every case because, if one case matches, all subsequently statements are excuted.
        // Also, though this is not required in this perticular case, it is good to use a default case always.
        System.out.println ("Prize amount is: $" + prize);
        
        System.out.println ("Switch fall-through:");
        // See what happens if "break" is not there!
        switch (prize) {
            case 500: System.out.println ("\tProze is more than $499");
            case 400: System.out.println ("\tProze is more than $399");
            case 300: System.out.println ("\tProze is more than $299");
            case 200: System.out.println ("\tProze is more than $199");
            default: System.out.println ("\tSome amount is awarded");
        }
    }
    
}
