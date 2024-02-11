import java.util.*;
import java.io.*;

public class Pz {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String w = ip.nextLine();
        boolean g = false;
        int l, n;
        for (n = 1; n <= w.length(); n++) {
            int con1 = w.length() - (n * 2);
            int con2 = n - 2;
            if (con1 == con2) {

                g = true;

                break;
            }
        }
        l = n;

        if (g == true) {
            System.out.println("The word " + w + " satisfy n*n grid by :" + l + "*" + l);
            int a = l + 1;
            int i = 0;

            for (int r = 1; r <= l; r++) {
                for (int c = 1; c <= l; c++) {
                    if (r == 1) {
                        System.out.print(w.charAt(i) + " ");
                        i++;
                    } else if (r == l) {
                        System.out.print(w.charAt(i) + " ");
                        i++;
                    } else if (r + c == a) {
                        System.out.print(w.charAt(i) + " ");
                        i++;
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
        } else {
            System.out.println("\n\t\tThe word " + w + " is not statisfy n*n grid ");

        }

    }

}