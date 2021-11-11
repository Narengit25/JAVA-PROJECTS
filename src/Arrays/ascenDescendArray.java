package Arrays;

import java.util.Scanner;

public class ascenDescendArray {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the no of elements ");
            int x = sc.nextInt();
            int a[] = new int[x];
            System.out.println(" enter the elements of x");
            for (int i = 0; i < x; i++) {

                a[i] = sc.nextInt();

            }
            for (int i = 0; i < x; i++) {

                for (int j = i + 1; j < x; j++) {

                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;

                    }
                }
            }
            System.out.println("the correct order is ");

            for (int i = 0; i < x; i++) {
                System.out.println(a[i]);
            }
        }
    }

