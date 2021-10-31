package com.company.Operators;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        int a , b , c, d ;
        Scanner ao = new Scanner(System.in);
        System.out.println("enter a");
        a = ao.nextInt();
        System.out.println("enter b");
        b = ao.nextInt();
        System.out.println("enter c");
        c = ao.nextInt();
        System.out.println("enter d");
        d = ao.nextInt();
        if ((a>b)&&(c<d)){
            System.out.println("1 is true");
        }
        else if ((b==a)||(d>a)){
            System.out.println("2 is true");
        }
        else {
            System.out.println("none is true");
        }
    }
}
