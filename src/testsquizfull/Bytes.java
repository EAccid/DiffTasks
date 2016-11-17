package testsquizfull;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Bytes {

    public static void main(String[] args) throws UnsupportedEncodingException {

        System.out.println("testsquizfull.A".getBytes("UTF-16").length);
        System.out.println("testsquizfull.AA".getBytes("UTF-16").length);

        System.out.println("testsquizfull.A".getBytes("UTF-8"));
        System.out.println("testsquizfull.AA".getBytes("UTF-8"));

        int[][] a = {{1, 2, 3}, {4, 0, 0,},};
        System.out.println(Arrays.deepToString(a));

        int n = 5;
        int g[][] = new int[n][n];

//        for(int i = 0; i < g.length; i++) {
//            for(int j = 0; j < g[i].length; j++) {
//                g[i][j] = i + j;
//            }
//        }

        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                g[i][j] = i + j;
            }
        }

        System.out.println(Arrays.deepToString(g));

        //////////////////////////////////////

    }
}
