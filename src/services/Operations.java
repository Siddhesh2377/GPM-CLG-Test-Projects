package services;

public class Operations {

    private final int a;
    private final int b;

    //Constructor
    public Operations(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //Addition
    public int add() {
        return a + b;
    }

    //Subtraction
    public int subtract() {
        return a - b;
    }

    //Multiplication
    public int multiply() {
        return a * b;
    }

    //Divide
    public int divide() {
        return a / b;
    }

}
