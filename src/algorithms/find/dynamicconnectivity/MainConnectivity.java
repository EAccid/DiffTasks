package algorithms.find.dynamicconnectivity;

import algorithms.find.unionimprov.QuickUnionImprovement;
import algorithms.find.unionimprov.UnionFind;
import algorithms.find.quickfind.QuickFindUF;
import algorithms.find.quickunion.QuickUnionUF;

/**
 * Dynamic-connectivity client
 * Read in number of objects N from standard input.
 * ・Repeat:
 * – read in pair of integers from standard input
 * – if they are not yet connected, connect them and print out pair
 * 10
 * 4   3
 * 3   8
 * 6   5
 * 9   4
 * 2   1
 * 8   9
 * 5   0
 * 7   2
 * 6   1
 * 1   0
 * 6   7
 */

public class MainConnectivity {

    private static UnionFind unionFind;

    public static void main(String[] args) {
        System.out.println("Quick Find...");
        setQuickFind();
        setUnion();
        testConnection(5, 4);

        System.out.println("\n\nQuick Union...");
        setQuickUnion();
        setUnion();
        testConnection(5, 4);

        System.out.println("\n\nQuick Union Improvement...");
        setQuickUnionImprovement();
        setUnion();
        testConnection(5, 4);

       }

    private static void setQuickFind() {
        unionFind = new QuickFindUF(10);
        System.out.println(unionFind);
    }

    private static void setQuickUnion() {
        unionFind = new QuickUnionUF(10);
        System.out.println(unionFind);
    }

    private static void setQuickUnionImprovement() {
        unionFind = new QuickUnionImprovement(10);
        System.out.println(unionFind);
    }

    private static void setUnion() {
        unionFind.union(4, 3);
        unionFind.union(3, 8);
        unionFind.union(6, 5);
        unionFind.union(9, 4);
        unionFind.union(2, 1);
        unionFind.union(5, 0);
        unionFind.union(7, 2);
        unionFind.union(6, 1);
        unionFind.union(7, 3);
        System.out.println(unionFind);
    }

    private static void testConnection(int p, int q) {
        long st, en;
        st = System.nanoTime();
        boolean connected = unionFind.connected(p, q);
        en = System.nanoTime();
        System.out.println("connected(" + p + "," + q + ") - " + connected);
        System.out.println("\nTwo time " + (en - st) / 1000000.d + " msc");
    }

}
