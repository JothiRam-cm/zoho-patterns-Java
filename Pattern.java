public class Pattern {
    public static void main(String[] args) {
        int n = 5, i, j;
        int count = 1;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
    }

}