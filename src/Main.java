import services.Operations;
import services.U;

import java.util.Scanner;

public class Main {

    static int a, b;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        U.println("Hello User !!");
        U.println("Input the number for a!");
        a = scanner.nextInt();

        U.println("Input the number for b!");
        b = scanner.nextInt();

        U.println("Select The Operation !! \n\n Addition - 1 \n Subtraction - 2 \n Multiplication - 3 \n Divide - 4");

        int input = scanner.nextInt();
        Operations o = new Operations(a, b);

        if (input == 1){
            U.println("> " + o.add());
        }else {
            if (input == 2){
                U.println("> " + o.subtract());
            }else {
                if (input == 3){
                    U.println("> " + o.multiply());
                }else {
                    if (input == 4){
                        U.println("> " + o.divide());
                    }else {
                        U.println("No Operation Selected \n Exiting The program !!");
                        System.exit(0);
                    }
                }
            }
        }

    }
}