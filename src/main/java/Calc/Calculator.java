package Calc;

public class Calculator {

    private double add(double a, double b) {
        return a+b;
    }

    private double subtract(double a, double b) {
        return a-b;
    }

    private double multiply (double a, double b) {
        return a*b;
    }

    private double divide (double a, double b) {
        if (b == 0) {
            return (int) a / (int) b;
        } else {
            return a / b;
        }
    }

   private long MathPow (double a, double b) {
        return (long)Math.pow(a,b);
    }
}

