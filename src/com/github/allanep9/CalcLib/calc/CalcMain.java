package com.github.allanep9.CalcLib.calc;

public class CalcMain{
    private static double num1, num2;
    private static char operand;

    public static void setOperand(char operand){
        CalcMain.operand = operand;
    }

    public static void setNum1(double num1){
        CalcMain.num1 = num1;
    }

    public static void setNum2(double num2){
        CalcMain.num2 = num2;
    }

    public static char getOperand(){
        return CalcMain.operand;
    }

    public static double getNum1(){
        return CalcMain.num1;
    }

    public static double getNum2(){
        return CalcMain.num2;
    }

    public String toString(){
        return getNum1() + " " + getOperand() + " " + getNum2() + " = " + calculate();
    }

    public static double calculate()
    {
        switch (operand){
            case '+':
                return Operations.add(num1, num2);
            case '-':
                return Operations.subtract(num1, num2);
            case '*':
                return Operations.multiply(num1, num2);
            case '/':
                return Operations.divide(num1, num2);
            case '^':
                return Operations.index(num1, num2);
            case '\\':
                return Operations.root(num1, num2);
            default:
                return 0;
        }
    }

    public static double calculate(double x, double y)
    {
        switch (operand){
            case '+':
                return Operations.add(x, y);
            case '-':
                return Operations.subtract(x, y);
            case '*':
                return Operations.multiply(x, y);
            case '/':
                return Operations.divide(x, y);
            case '^':
                return Operations.index(x, y);
            case '\\':
                return Operations.root(x, y);
            default:
                return 0;
        }
    }

    public static double calculate(double x, char operation, double y)
    {
        switch (operation){
            case '+':
                return Operations.add(x, y);
            case '-':
                return Operations.subtract(x, y);
            case '*':
                return Operations.multiply(x, y);
            case '/':
                return Operations.divide(x, y);
            case '^':
                return Operations.index(x, y);
            case '\\':
                return Operations.root(x, y);
            default:
                return 0;
        }
    }
}
