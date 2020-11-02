package com.kodilla;

public class SimpleCalculator {
    public double addAToB (double a, double b){
        return a+b;
    }
    public double subtractAFromB (double a, double b){
        return a-b;
    }
    public static void main (String[] args){
        SimpleCalculator calculator = new SimpleCalculator();
        double add = calculator.addAToB(15, 11);
        double sub = calculator.subtractAFromB(9,11);
        System.out.println(add +"\n" + sub);
    }
}
