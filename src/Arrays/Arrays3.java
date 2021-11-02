package Arrays;

import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter x value");
        int x = sc.nextInt();
        System.out.println("enter y value");
        int y = sc.nextInt();
        int a[][] = new int[x][y];
        System.out.println("enter a matrix values");
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }
}
