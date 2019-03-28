/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial;

import oracle.java.se.tutorial.javaConcepts.ClassDemo;
import oracle.java.se.tutorial.javaConcepts.InheritanceDemo;

/**
 *
 * @author sibashis
 * This project contains all the codes from Oracle Java SE Tutorial 
 * 
 */
public class OracleJavaSETutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Job 1. Any programming tutorial must start with the famous "Hello World" app.
        URL: https://docs.oracle.com/javase/tutorial/getStarted/cupojava/netbeans.html
        */
        System.out.println ("\nLesson 1 (Hello World App):\n");
        System.out.println ("Hello World!");
        
        System.out.println ("------------------------------------------------------------------");
                
        /*
        Job 2. What are class and objects
        URL: https://docs.oracle.com/javase/tutorial/java/concepts/class.html
        */
        
        System.out.println ("\nLesson 2 (Class and Object):\n");
        ClassDemo classDemo = new ClassDemo ();
        classDemo.bicycleDemo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 3. Inheritance
        URL: https://docs.oracle.com/javase/tutorial/java/concepts/inheritance.html
        */
        
        System.out.println ("\nLesson 3 (Inheritance):\n");
        
        InheritanceDemo inheritanceDemo = new InheritanceDemo ();
        inheritanceDemo.mountainBikeDemo();
        
        System.out.println ("------------------------------------------------------------------");
    
    }
    
}
