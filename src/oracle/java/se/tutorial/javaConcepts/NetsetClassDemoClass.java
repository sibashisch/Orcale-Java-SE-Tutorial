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
public class NetsetClassDemoClass {
    
    /*
    This class define a static nested class and a non static netsed class, i.e. an inner class
    */
    
    public static class StaticClass {
        public int x;
        
        public StaticClass () {
            System.out.println ("This is an static constructor!");
            x = 0;
        }
        
        public StaticClass (int a) {
            System.out.println ("This is an static constructor!");
            x = a;
        }
    }
    
    public class InnerClass {
        public int x;
        
        public InnerClass () {
            System.out.println ("This is an inner constructor!");
            x = 0;
        }
        
        public InnerClass (int a) {
            System.out.println ("This is an inner constructor!");
            x = a;
        }
    }
    
    public StaticClass staticClassObj;
    public InnerClass innserClassObj;
    public int x;

    public NetsetClassDemoClass () {
        x = 0;
        innserClassObj = new InnerClass (1);
        staticClassObj = new StaticClass (2);
        System.out.println ("This is a constructor!");
    }
    
    public NetsetClassDemoClass (int a) {
        x = a;
        innserClassObj = new InnerClass (a + 1);
        staticClassObj = new StaticClass (a + 2);
        System.out.println ("This is a constructor!");
    }
    
    public void printState (int x) {
        System.out.println ("param: " + x + " enclosing: " + this.x + " inner: " + this.innserClassObj.x);
    }
}
