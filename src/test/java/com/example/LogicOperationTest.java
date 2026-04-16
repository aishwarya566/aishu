package com.logic;

/**
 * Main class to demonstrate Logic Operations
 */
public class Main {

    public static void main(String[] args) {
        LogicOperations logic = new LogicOperations();

        System.out.println("=== Logic Operations Demo ===\n");

        // Test AND operation
        System.out.println("AND Operations:");
        System.out.println("true AND true = " + logic.performAND(true, true));
        System.out.println("true AND false = " + logic.performAND(true, false));
        System.out.println("false AND false = " + logic.performAND(false, false));

        // Test OR operation
        System.out.println("\nOR Operations:");
        System.out.println("true OR true = " + logic.performOR(true, true));
        System.out.println("true OR false = " + logic.performOR(true, false));
        System.out.println("false OR false = " + logic.performOR(false, false));

        // Test NOT operation
        System.out.println("\nNOT Operations:");
        System.out.println("NOT true = " + logic.performNOT(true));
        System.out.println("NOT false = " + logic.performNOT(false));

        // Test XOR operation
        System.out.println("\nXOR Operations:");
        System.out.println("true XOR true = " + logic.performXOR(true, true));
        System.out.println("true XOR false = " + logic.performXOR(true, false));
        System.out.println("false XOR false = " + logic.performXOR(false, false));

        // Test NAND operation
        System.out.println("\nNAND Operations:");
        System.out.println("true NAND true = " + logic.performNAND(true, true));
        System.out.println("true NAND false = " + logic.performNAND(true, false));

        // Test NOR operation
        System.out.println("\nNOR Operations:");
        System.out.println("true NOR true = " + logic.performNOR(true, true));
        System.out.println("true NOR false = " + logic.performNOR(true, false));

        // Test XNOR operation
        System.out.println("\nXNOR Operations:");
        System.out.println("true XNOR true = " + logic.performXNOR(true, true));
        System.out.println("true XNOR false = " + logic.performXNOR(true, false));

        System.out.println("\n=== Application Completed Successfully ===");
    }
}
