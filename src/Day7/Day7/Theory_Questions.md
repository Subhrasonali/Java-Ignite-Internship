1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.

Class: A class is a blueprint or template used to create objects.
Object: An object is an instance of a class.
Example:
Class = Car
Objects = BMW, Audi, Tesla

class Car {
    String color;
}

Car c1 = new Car();


A class only defines properties and behaviors. Memory is allocated only when an object is created. Therefore, non-static variables and methods need an object to be accessed

2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?

Access modifiers control the visibility of classes, variables, and methods.
public:
Accessible from anywhere.
public String name;
private:
Accessible only inside the same class.
private double salary;

Why is it not safe to make all variables public?
If all variables are public, anyone can modify them directly, which may lead to invalid or incorrect data. It breaks data security and encapsulation.

3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).

Encapsulation means hiding data using private variables and providing access through public methods.
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
Real-life example: ATM
You cannot directly access the money stored in a bank account. You use ATM functions such as withdraw, deposit, and balance inquiry. The actual balance remains protected.

4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
A constructor is a special method that is automatically called when an object is created.
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
How is the keyword this used inside a constructor?
this refers to the current object and is used to differentiate instance variables from local variables.
this.name = name;
Why do we use constructors to initialize object values?
Constructors ensure that objects receive initial values at the time of creation, making the code cleaner and reducing errors.
Student s1 = new Student("Sonali");
This automatically initializes the object's data when it is created.