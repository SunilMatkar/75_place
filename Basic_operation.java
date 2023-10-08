package Java.Array;

import java.util.Scanner;

public class Basic_operation {
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        int arr[] = new int[4];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();

        System.out.println("chem " + arr[0]);
        System.out.println("phy " + arr[1]);
        System.out.println("math " + arr[2]);
        System.out.println("oop " + arr[3]);

        int avg = (arr[0]+ arr[1] + arr[2] + arr[3]) / 3;
        System.out.println("The total persentage is " + avg);
    }
}
