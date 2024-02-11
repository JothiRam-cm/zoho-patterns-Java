public class PatternPrinter {
    public static void printPattern(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 5;
        printPattern(a);
    }
}