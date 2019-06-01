/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.annotations;

import java.lang.annotation.Documented;

/**
 *
 * @author sibashis
 */

@Documented
public @interface ModuleInformation {
    /*
    This is an user defined annotation.
    This annotation contains meta information about a class defined as a part of a softare project.
    Also, we have provided the Javadoc annotation to demonstrate the use of pre-defined annotations.
    Here declaring the "Documented" annotation makes sure that this annotation goes into the generated javadoc.
    */
    
    /*
    All the classed except those defined in the oracle.java.se.tutorial.annotations, oracle.java.se.tutorial.demoPackage
    and oracle.java.se.tutorial.javaConcepts will use this annotation to demonstrate it's use.
    */
    
    String author() default "Sibashis Chatterjee (sibashis1992@gmail.com)";
    String date();
    String lastModifiedBy() default "N/A";
    String lastModifiedOn() default "N/A";
    String description() default "This ia a module defined as a part of the Oracle Java SE Tutorial example project";
}
