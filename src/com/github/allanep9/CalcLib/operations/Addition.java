package com.github.allanep9.CalcLib.operations;

public class Addition {
    private static double x;
    private static double y;
    private static double sum;
    public Addition(double x, double y) {
        x = Addition.x;
        y = Addition.y;
    }
    public Addition(double x) {
        x = Addition.x;
        y = 0;
    }
    public static double add() {
        sum = x+y;
        return sum;
    }
}
