package Practical.LLO2;

import services.U;

public class MethodOverLoading {

    public static void main(String[] args) {
        MethodOverLoading m1 = new MethodOverLoading();

        U.println("Sun if 2 int's " + m1.add(53, 130));
        U.println("Sun if 3 int's " + m1.add(33, 63, 9));
        U.println("Sun if 2 double's " + m1.add(5.35, 33.43));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

}
