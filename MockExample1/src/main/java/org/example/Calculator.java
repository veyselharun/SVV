package org.example;

public class Calculator {
    public MathOperations mathOperations;

    public Calculator(MathOperations mathOperations) {
        this.mathOperations = mathOperations;
    }

    public int add(int a, int b) {
        return mathOperations.add(a, b);
    }

    public int subtract(int a, int b) {
        return mathOperations.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return mathOperations.multiply(a, b);
    }

    public float divide(int a, int b) {
        return mathOperations.divide(a, b);
    }
}
