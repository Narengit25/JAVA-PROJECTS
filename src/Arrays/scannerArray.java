package Arrays;

import java.util.Scanner;

 // creating matrix addition with scanner array
public class scannerArray {
    public static void main(String[] args) {
        int x, y, i, j;
        int a[][] = new int[4][3];
        int b[][] = new int[4][3];
        int c[][] = new int[4][3];

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter x,y value ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(" enter a array value ");
        for (i = 0; i < x; i++) {

            for (j = 0; j < y; j++) {

                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" enter b array value");

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {

                b[i][j] = sc.nextInt();

            }
        }

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {

                c[i][j] = a[i][j] + b[i][j];

            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {

                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }


    }
}
