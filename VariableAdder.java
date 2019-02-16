package edu.dmacc.codedsm.hw4;

public class VariableAdder {

    final static int REGULAR_HOURS = 40; // Instance constant variable
    static int overTime = 6;             //  Instance variable

    public static void main(String[] args) {

        int pto = 0;                  //    Method variable

        int result = REGULAR_HOURS + overTime + pto;
        System.out.println("Hours worked this week are: " + result);

    }
}
