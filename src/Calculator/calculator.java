package Calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // in addition

        System.out.println(" enter a value ");
        int a = sc.nextInt();
        System.out.println(" enter b value ");
        int b = sc.nextInt();

        int c = a + b;

        System.out.println(c);

//      subtraction
        System.out.println(" enter d value ");
        int d = sc.nextInt();
        System.out.println(" enter e value ");
        int e = sc.nextInt();

        int f = d - e;

        System.out.println(f);

//      multiplication
        System.out.println(" enter g value ");
        int g = sc.nextInt();
        System.out.println(" enter h value ");
        int h = sc.nextInt();

        int i = g * h;
        System.out.println(i);

//        division

        System.out.println(" enter j value ");
        int j = sc.nextInt();
        System.out.println(" enter k value ");
        int k = sc.nextInt();

        int l = j / k;
        System.out.println(l);

//        remainder operator

        System.out.println(" enter d value ");
        int m = sc.nextInt();
        System.out.println(" enter e value ");
        int n = sc.nextInt();

        int o = m % n;
        System.out.println(o);

//        same applies for double , long , float
    }
}