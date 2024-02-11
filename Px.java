
import java.util.*;
import java.io.*;

class Px {
    public static void main(String[] args) {
        int i, j;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = ip.nextInt();
        int a = n + 1;
        for (i = 1; n >= i; i++) {
            for (j = 1; n >= j; j++) {

                if (i == j) {
                    System.out.print(i);
                } else if (i + j == a) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}