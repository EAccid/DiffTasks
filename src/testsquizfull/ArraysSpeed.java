package testsquizfull;

public class ArraysSpeed {

    public static void main(String[] args) throws java.lang.Exception {
        int n = 10000;

        int g[][] = new int[n][n];
        long st, en;

        // one
        st = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = i + j;
            }
        }
        en = System.nanoTime();
        System.out.println("\nOne time " + (en - st) / 1000000.d + " msc");

        ////////////////

        // two
        st = System.nanoTime();
        for (int i = 0; i < n; i++) {
            g[i][i] = i + i;
            for (int j = 0; j < i; j++) {
                g[j][i] = g[i][j] = i + j;
            }
        }
        en = System.nanoTime();
        System.out.println("\nTwo time " + (en - st) / 1000000.d + " msc");

    }

}
