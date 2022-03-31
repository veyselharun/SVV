
public class Calculator {


    public static double divide(double a, double b) {
        double result;
        if (b == 0) throw new IllegalArgumentException("Divide by zero exception.");
        result = a / b;
        return result;
    }

}
