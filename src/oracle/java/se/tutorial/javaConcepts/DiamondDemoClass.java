/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

import oracle.java.se.tutorial.annotations.ModuleInformation;

/**
 *
 * @author sibashis
 */

@ModuleInformation (date="01/06/19")
public class DiamondDemoClass implements DiamondDemoFirstInterface, DiamondDemoSecondInterface {
    /*
    This class implements the two interfaces "DiamondDemoFirstInterface" and "DiamondDemoSecondInterface". Both of these
    interfaces are extended from another interface "DiamondDemoBaseInterface" and both them overrides a function named
    "printClassName" defined as default in "DiamondDemoBaseInterface". Now this gives rise to the classic diamond problem.
    */
    
    /*
    Till the following was defined, an compilation error was present:
    class DiamondDemoClass inherits unrelated defaults for printClassName() from types DiamondDemoFirstInterface nad 
    DiamondDemoSecondInterface
    */
    
    @Override
    public void printClassName () {
        System.out.println ("Class Name => DiamondDemoClass");
    }

    @Override
    public void firstFunction() {
        System.out.println ("Demo Implementation of firstFunction");
    }

    @Override
    public void secondFunction() {
        System.out.println ("Demo Implementation of secondFunction");
    }
    
    public void demo () {
        printClassName ();
        printRootInterfaceName();
        firstFunction();
        secondFunction();
    }
    
}
