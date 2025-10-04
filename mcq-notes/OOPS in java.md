# OBJECT ORIENTED PROGRAMMING SYSTEMS (OOPS)  
## JAVA

Object-Oriented Programming (OOP) is a methodology or paradigm to design a program using **classes** and **objects**.  
It simplifies software development and maintenance by providing key concepts:

---

## Core Concepts

### 1. Class

A **class** is a user-defined data type that defines properties and functions.  
It is a logical representation of data.

> **Example:**  
> Human being is a class. The body parts of a human are properties, and actions (walking, speaking) are functions.

### 2. Object

An **object** is a run-time entity and an instance of a class.  
It can represent a person, place, or any item, and operates on data members and member functions.

---

## Example 1: Student Class

```java
class Student {
    String name;
    int age;
    
    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Shradha";
        s2.age = 22;
        s2.getInfo();
    }
}