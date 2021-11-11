package com.github.allanep9.CalcLib.operations;

public class Exponents {
    private static double x;
    private static double y;
    private static double output;
    public Exponents(double x, double y) {
        x = Exponents.x;
        y = Exponents.y;
    }
    public Exponents(double x) {
        x = Exponents.x;
        y = 0;
    }
    public static double index(){
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
}
