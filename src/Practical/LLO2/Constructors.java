package Practical.LLO2;

import services.U;

public class Constructors {

    String name;
    int age;

    public Constructors() {
        name = "Unknown";
        age = 0;
    }

    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors("Vasooli Bhai", 45);

        c1.display();
        c2.display();
    }

    public void display() {
        U.println("Name: " + name);
        U.println("Age : " + age);
    }
}
