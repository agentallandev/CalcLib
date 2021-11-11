package com.github.allanep9.CalcLib.operations;

public class Subtraction {
    private static double x;
    private static double y;
    private static double difference;
    public Subtraction(double x, double y) {
        x = Subtraction.x;
        y = Subtraction.y;
    }
    public Subtraction(double x) {
        x = Subtraction.x;
        y = 0;
    }
    public static double subtract() {
        difference = x-y;
        return difference;
    }
}
