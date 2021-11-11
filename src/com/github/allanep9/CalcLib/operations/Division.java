package com.github.allanep9.CalcLib.operations;

public class Division {
    private static double x;
    private static double y;
    private static double quotient;
    public Division(double x, double y) {
        x = Division.x;
        y = Division.y;
    }
    public Division(double x) {
        x = Division.x;
        y = 0;
    }
    public static double divide(){
        quotient = x/y;
        return quotient;
    }
}
