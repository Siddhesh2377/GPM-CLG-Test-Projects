package Projects;

import services.U;

public class PatternClass {

    public static void main(String[] args) {

        simpleStar();

    }

    //Simple Star
    static void simpleStar() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                U.print("* ");
            }
            U.println("");
        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = i; j < 5; j++) {
//                U.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                U.print("*");
//            }
//            U.println("");
//        }
    }

}
