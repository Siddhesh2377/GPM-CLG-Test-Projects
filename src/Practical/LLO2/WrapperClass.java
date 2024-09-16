package Practical.LLO2;

import services.U;

public class WrapperClass {

    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 3450;
        char primitiveChar = 'V';

        // Converting primitives to wrapper objects (Autoboxing)
        Integer wrapperInt = primitiveInt;
        Character wrapperChar = primitiveChar;

        // Displaying the wrapper objects
        U.println("Wrapper Integer: " + wrapperInt);
        U.println("Wrapper Character: " + wrapperChar);

        // Converting wrapper objects back to primitives (Unboxing)
        int unboxedInt = wrapperInt;
        char unboxedChar = wrapperChar;

        // Performing operations using wrapper class methods
        String intAsString = wrapperInt.toString();
        int parsedInt = Integer.parseInt("353");

        // Displaying results
        U.println("Unboxed Integer: " + unboxedInt);
        U.println("Unboxed Character: " + unboxedChar);
        U.println("Integer as String: " + intAsString);
        U.println("Parsed Integer from String: " + parsedInt);
    }
}
