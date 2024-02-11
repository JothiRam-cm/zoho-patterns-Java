import java.util.*;
import java.io.*;

public class ZP1 {
    public static void main(String[] args) {

        int n = 5, i, j, k, a, b = 0;

        for (i = 1; i <= n; i++) {
            k = n - 1;
            a = i;
            for (j = 1; j <= i; j++) {
                System.out.print(a);
                a += k;
                k--;
            }
            System.out.println(" ");
        }

    }

}
