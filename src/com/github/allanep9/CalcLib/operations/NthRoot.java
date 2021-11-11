package com.github.allanep9.CalcLib.operations;

public class NthRoot {
    private static double x;
    private static double root;
    private static double output;
    public NthRoot(double x, double root) {
        x = NthRoot.x;
        root = NthRoot.root;
    }
    public NthRoot(double x) {
        x = NthRoot.x;
        root = 0;
    }
    public static double root(){
        if(root == 1)
            output = x;
        if(root == 2)
            output = Math.sqrt(x);
        if(root > 2)
        {
          output = nthRoot(x, root);
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
