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
public class Member {
    /*
    This class is used to demonstrate the lambda expression. This class holds information about one member in 
    a social networking site.
    */
    public enum Sex {
        MALE, FEMALE, THIRD
    } 
    
    String name;
    int age;
    Sex gender;
    
    public Member (String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void printMember () {
        System.out.println (name + ", " + age + ", " + gender);
    }
    
    // To generalize any selection on this class, we provide local facility
    public void printMember (CheckPerson p) {
        if (p.test(this)) {
            System.out.println (name + ", " + age + ", " + gender);
        }
    }
    
    // but then we need to provide the interface as weel for caller to implement
    public interface CheckPerson {
        boolean test(Member m);
    }
}
