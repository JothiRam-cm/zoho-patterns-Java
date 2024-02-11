import java.util.*;

public class RT1 {

    public static void main(String[] args) {
        int n = 4, i, j, k;
        for (i = 1; i <= n; i++) {
            k = i;
            for (j = 1; j <= ((i * 2) - 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(k);
                }
            }
            System.out.println(" ");
        }

    }

}
