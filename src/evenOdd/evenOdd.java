package evenOdd;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {


//    type-1

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a value ");
        int a = sc.nextInt();

        {
            if (a % 2 == 0) {
                System.out.println(" it is even ");
            } else {
                System.out.println(" odd ");
            }
        }


// type-2
        System.out.println(" enter e value ");
        int e = sc.nextInt();

        String x = " ";
        {
            x = (e % 2 == 0) ? "even" : "odd";
        }
        System.out.println(x);
    }

}