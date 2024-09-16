package Practical.LLO2;

import services.U;

public class CLIArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            U.println("CLI Args : ");

            for (int i = 0; i < args.length; i++) {
                U.println("Args : " + (i + 1) + ": " + args[i]);
            }
        }else {
            U.println("No CLI Args were Passed !");
        }
    }
}
