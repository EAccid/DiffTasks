package algorithms.dynamicconnectivity;


import algorithms.QuickUnionUF;

public class MainConnectivity {

    public static void main(String[] args) {

        QuickUnionUF quickUnionUF = new QuickUnionUF(10);
        System.out.println(quickUnionUF);

        quickUnionUF.union(4, 3);
        quickUnionUF.union(3, 8);
        quickUnionUF.union(6, 5);
        quickUnionUF.union(9, 4);
        quickUnionUF.union(2, 1);
        quickUnionUF.union(5, 0);
        quickUnionUF.union(7, 2);
        quickUnionUF.union(6, 1);
        quickUnionUF.union(7, 3);

        System.out.println(quickUnionUF);

        int p = 5;
        int q = 4;
        System.out.println("connected(" + p + "," + q + ") - " + quickUnionUF.connected(p, q));

    }

}
