/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial;

import oracle.java.se.tutorial.javaConcepts.*;

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
    
        /*
        Job 4. Interface
        URL: https://docs.oracle.com/javase/tutorial/java/concepts/interface.html
        */
        
        System.out.println ("\nLesson 4 (Interafce):\n");
        
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.alarmClockDemo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 5. Variables
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        */
        
        System.out.println ("\nLesson 5 (Variables):\n");
        
        VariableDemo variableDemo = new VariableDemo();
        variableDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 6. Array
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        */
        
        System.out.println ("\nLesson 6 (Array):\n");
        
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 7. Operators
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
        */
        
        System.out.println ("\nLesson 7 (Operators):\n");
        
        OperatorDemo operatorDemo = new OperatorDemo();
        operatorDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 8. Statements and Blocks
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/expressions.html
        */
        
        System.out.println ("\nLesson 8 (Statement and Blocks):\n");
        
        BlockDemo blockDemo = new BlockDemo();
        blockDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 9. Branch Control
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
         and https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
        */
        
        System.out.println ("\nLesson 9 (Branch Control):\n");
        
        BranchDemo branchDemo = new BranchDemo();
        branchDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 10. Loop Control
        URL: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
         and https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
        */
        
        System.out.println ("\nLesson 10 (Loop Control):\n");
        
        LoopControlDemo loopDemo = new LoopControlDemo();
        loopDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 11. Constructor, overloading and access modifier
        URL: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
         and https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
         and https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html 
        */
        
        System.out.println ("\nLesson 11 (Constructor, overloading and access modifier):\n");
        
        MethodDemo methodDemo = new MethodDemo();
        methodDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
        /*
        Job 12. Access Modifiers
        URL: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
        */
        
        System.out.println ("\nLesson 12 (Access Control):\n");
        
        AccessDemo accessDemo = new AccessDemo();
        accessDemo.demo();
        
        System.out.println ("------------------------------------------------------------------");
        
    }
    
}
