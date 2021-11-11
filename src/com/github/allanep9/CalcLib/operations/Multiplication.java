package com.github.allanep9.CalcLib.operations;

public class Multiplication {
    private static double x;
    private static double y;
    private static double product;
    public Multiplication(double x, double y) {
        x = Multiplication.x;
        y = Multiplication.y;
    }
    public Multiplication(double x) {
        x = Multiplication.x;
        y = 0;
    }
    public static double multiply(){
        product = x*y;
        return product;
    }
}
