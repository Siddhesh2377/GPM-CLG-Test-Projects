package Practical.LLO2;

import services.U;

import java.util.Vector;

public class StringVector {

    public static void main(String[] args) {
        // Demonstrate String functions
        String str = "Yoo, Siddhesh!";
        U.println("Original String: " + str);

        // Length of the string
        U.println("Length: " + str.length());

        // Character at index 7
        U.println("Character at index 7: " + str.charAt(7));

        // Substring from index 7 to end
        U.println("Substring from index 7: " + str.substring(7));

        // Index of character 'W'
        U.println("Index of 'W': " + str.indexOf('W'));

        // Convert to uppercase
        U.println("Uppercase: " + str.toUpperCase());

        // Replace 'World' with 'Java'
        String replacedStr = str.replace("World", "Java");
        U.println("After replace: " + replacedStr);

        // Demonstrate Vector data type
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Vasooli Bhai");
        vector.add("Gopal");
        vector.add("Pappi Bhai");

        U.println("\nVector Elements:");

        for (String fruit : vector) {
            U.println(fruit);
        }

        // Accessing element at index 1
        U.println("Element at index 1: " + vector.get(1));

        // Removing element "Banana"
        vector.remove("Gopal");

        U.println("After removing 'Banana': " + vector);

        // Size of the Vector
        U.println("Vector size: " + vector.size());
    }
}
