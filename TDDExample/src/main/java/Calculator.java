
public class Calculator {

    /*
    public static double divide(int a, int b) {
        double result;
        result = (double) a / (double) b;
        return result;
    }

    public static double divide(double a, int b) {
        double result;
        result = (double) a / (double) b;
        return result;
    }

    public static double divide(int a, double b) {
        double result;
        result = (double) a / (double) b;
        return result;
    }
     */

    public static double divide(double a, double b) {
        double result;
        if (b == 0) throw new IllegalArgumentException("Divide by zero exception.");
        result = (double) a / (double) b;
        return result;
    }

}
