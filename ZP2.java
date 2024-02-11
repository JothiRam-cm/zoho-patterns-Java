class ZP2 {
    public static void main(String[] args) {
        int n = 5, i, j, k;

        for (i = 1; n >= i; i++) {

            for (k = i; n > k; k++) {
                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) {

                System.out.print(j);

            }

            System.out.println(" ");
        }

    }
}