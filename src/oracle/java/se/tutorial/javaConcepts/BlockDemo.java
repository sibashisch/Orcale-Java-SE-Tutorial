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
public class BlockDemo {
    /*
    This class defines two blocks of code and shows that the local variable scope i limited within its block of creaton
    */
    
    public void demo () {
        
        int i = 5;
        System.out.println ("Variable created outside blocks (i) = " + i);
        
        {
            // In the first block we change the value of i and create a new variable j
            i ++;
            int j = 4;
            System.out.println ("In block 1 (i,j) = " + i + "," + j);
        }
        
        {
            // In the second block, we furthe update the value of i and see that the change in first block
            // is visible here also.
            // But, The variable created in first block is no longer visible here, and we are alloed to create
            // another variable with same name, even having different type.
            i ++;
            double j = 8.2;
            System.out.println ("In block 2 (i,j) = " + i + "," + j);
        }
        
        System.out.println ("So, global variables are accessible from both blocks, but local variables are hidden");
    }
}
