package com.github.allanep9.CalcLib.calc;

public class Operations {
    private static double output;

    public static double add(double x, double y) {
        output = x+y;
        return output;
    }

    public static double subtract(double x, double y) {
        output = x-y;
        return output;
    }

    public static double multiply(double x, double y){
        output = x*y;
        return output;
    }

    public static double divide(double x, double y){
        output = x/y;
        return output;
    }

    public static double index(double x, double y){
        output = x;
        if(y > 0)
            for(int exponent = 0; exponent < y-1; exponent++)
            {
                output *= x;
            }
        else if(y < 0) {
            for (int exponent = 0; exponent < y - 1; exponent++) {
                output *= x;
            }
            output = 1/output;
        }
        else if(y==0)
            output = 1;
        return output;
    }

    public static double root(double x, double y){
        if(y == 1)
            output = x;
        if(y == 2)
            output = Math.sqrt(x);
        if(y > 2)
        {
            output = nthRoot(x, y);
        }
        return output;
    }
    private static double nthRoot(double root, double x) {
        double x0 = 1;
        boolean accurate = false;
        while (!accurate) {
            double x1 = (1 / (double)root) * ((root - 1) * x0 + x / Math.pow(x0, root - 1));
            accurate = accurate(x0, x1);
            x0 = x1;
        }
        return x0;
    }
    private static boolean accurate(double x0, double x1) {
        return Math.abs(x1-x0) < 0.000001;
    }
}