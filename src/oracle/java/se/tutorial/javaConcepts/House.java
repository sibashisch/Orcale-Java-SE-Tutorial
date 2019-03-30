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
public class House {
    /*
    This class is used to demonstrate two basic concepts of Object Oriented Programming.
    1. Access Restriction to fields and methods (Data Encapsulation)
    2. Method Overloading (Polymorphism)
    Also, this class demonstrates "constructors", a very important concept to understand while using classes.
    */
    
    // The fields are used to hold the state of the house. They are recommended to be used by the object only and
    // other classes should not be able to modify them.
    // Fo achieve this we use "private" access modifiers on fields
    
    private int floorNo, rooms, age, area;
    private String address;
    
    // Till now we were assigning some values to the fileds while declaring them in the classes. But, in this
    // case, as well as in most real-life problems, you won't know their default values at this point.
    // There is a mechanism for providing these values while creationg the object. They are called constructors.
    
    public House () { // This is a constructor.
        
    }
    
    // The above is a default constructor. This is also created imlicitly if no constructor is defined.
    
    // Another important concept of OOP is polymorphism, and as a part of that a feature called "methid overloading"
    // comes. We can define another function with same name but different paramenet list. While calling, the parameter
    // list is matched to call the correct method.
    
    public House (int floor, int room, int age, int area, String address) {
        this.address = address;
        this.age = age;
        this.area = area;
        this.floorNo = floor;
        this.rooms = room;
    }
    
    // Now, the variables are hidden to the outside, so there should be some mechanism to the outside for
    // accessing those variables.
    // This class allows updating age and room count only after once an object is created. We do this using 
    // something called "setters".
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public void setRoom (int room) {
        this.rooms = room;
    }
    
    // But, accessing to all fields are allowed. These is done using "getters".

    public int getFloorNo() {
        return floorNo;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAge() {
        return age;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }
    
    // As we have shown overloading with the constructor, the same can be done on any function
    // e.g., the "serAge" function we defined expects the age of the house int months. Instead, we can mention
    // number of years and months and calculate the age in the function.
    
    public void setAge (int yr, int mon) { // overloaded function
        this.age = 12 * yr + mon;
    }
    
    // Another concept is that the parameters can be provided as lists also, i.e. we don't know how
    // many parameters will be provided while actually calling this function. In that case we access the params as
    // an array.
    
    public void setAddress (String ... addParts) {
        this.address = "";
        for (String addPart : addParts) {
            this.address += addPart + " ";
        }
    }
    
}
