package com.company.Operators;

import java.util.Scanner;

public class relationalOperators {
    public static void main(String[] args) {
        // ==, <,>,<=,>=,!=
        int a , b, s=25,t=50;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a = sc.nextInt();
        System.out.println("enter b");
        b = sc.nextInt();
        if (a == b){
            System.out.println("a is equal to b");
        }
        else if (b>t){
            System.out.println("t is lesser than b");
        }
        else if (a>s){
            System.out.println("a is bigger");
        }
        else if (t!=s){
            System.out.println("t and s are not equal");

        }
        else {
            System.out.println("invalid value");
        }
    }
}
