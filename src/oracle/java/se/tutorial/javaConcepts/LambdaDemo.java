/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracle.java.se.tutorial.javaConcepts;

import java.util.ArrayList;
import static oracle.java.se.tutorial.javaConcepts.Member.Sex.*;

/**
 *
 * @author sibashis
 */
public class LambdaDemo {
    /*
    This class demonstrates the use of lambda expressions.
    To do this we shall make use of the Member class and populate some members of our social networking site in a list.
    */
    
    ArrayList <Member> memberList = new ArrayList <> ();
    
    
    
    public void demo () {
        memberList.add(new Member ("Member 1", 20, MALE));
        memberList.add(new Member ("Member 1", 30, FEMALE));
        memberList.add(new Member ("Member 1", 40, THIRD));
        memberList.add(new Member ("Member 1", 25, MALE));
        memberList.add(new Member ("Member 1", 35, FEMALE));
        memberList.add(new Member ("Member 1", 45, THIRD));
        
        // Now we shall try to find out members older than certain age:
        int refAge = 39;
        
        // one basic way to do so is using for loop:
        System.out.println ("Simple for loop:");
        for (Member member: memberList) {
            if (member.age >= refAge) {
                member.printMember();
            }
        }
        // The above fails if the structure of Member class changes, i.e. maybe we start storing age as double.
        // It becomes cluttered if the criteria is very complex.
        
        // More generalized approach would be using the local filter provided in the Member class:
        System.out.println ("Annonymous class implementing the required test interface:");
        for (Member member: memberList) {
            member.printMember(new Member.CheckPerson() {
                @Override
                public boolean test(Member m) {
                    return m.age >= refAge; 
                }
            });
        }
        
        // The above is too complex. Let's use Lamba
        System.out.println ("Lambda inside for loop:");
        for (Member member: memberList) {
            member.printMember ((Member m) -> m.age >= refAge);
        }
        
        // The following would be the best
        System.out.println ("Full use of lambda");
        memberList.forEach((member) -> {
            member.printMember ((Member m) -> m.age >= refAge);
        });
    }
    
}
