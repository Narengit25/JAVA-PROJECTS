package com.company.Operators;

public class nestedIf {
    public static void main(String[] args) {


        boolean car = true;
        String car1Colour = "Red";
        String car2Colour = "Blue";
        {
            if (car == true) {

                if (car1Colour == "red") {
                    System.out.println("it is car 1  ");
                } else {
                    System.out.println("it is car 2");
                }
            } else {
                System.out.println("it is not a car");
            }
        }
    }
}
