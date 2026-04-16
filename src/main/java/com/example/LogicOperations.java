package com.logic;

/**
 * LogicOperations class performs various logical operations
 */
public class LogicOperations {

    /**
     * Performs AND operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a AND b
     */
    public boolean performAND(boolean a, boolean b) {
        return a && b;
    }

    /**
     * Performs OR operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a OR b
     */
    public boolean performOR(boolean a, boolean b) {
        return a || b;
    }

    /**
     * Performs NOT operation on a boolean value
     * @param a boolean value
     * @return result of NOT a
     */
    public boolean performNOT(boolean a) {
        return !a;
    }

    /**
     * Performs XOR (exclusive OR) operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a XOR b
     */
    public boolean performXOR(boolean a, boolean b) {
        return a ^ b;
    }

    /**
     * Performs NAND operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a NAND b
     */
    public boolean performNAND(boolean a, boolean b) {
        return !(a && b);
    }

    /**
     * Performs NOR operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a NOR b
     */
    public boolean performNOR(boolean a, boolean b) {
        return !(a || b);
    }

    /**
     * Performs XNOR operation on two boolean values
     * @param a first boolean value
     * @param b second boolean value
     * @return result of a XNOR b
     */
    public boolean performXNOR(boolean a, boolean b) {
        return !(a ^ b);
    }
}
