package thinkinginjava;


import java.util.Arrays;

/**
 * 6 right
 * 20
 */
public class HelloWorld {

    public static void main(String[] args) {
//        Integer oInt1 = null;
//        Integer oInt2 = 0;
//        final int int1 = oInt1;
//        final int int2 = oInt2;
//        System.out.println(int1 == int2);


//        Возникнет java.lang.NullPointerException в 5-й строке, поскольку компилятор преобразует выражение
//
//        final int int1 = oInt1;
//        в
//        final int int1 = oInt1.intValue();


//        int a = -7;
//        System.out.println(a>>>1);
        int n = 33;
        float  s;
//        while (n > 0) {
//            s += n % 2;
//            n /= 2;
//        }
        s = 5%6;
        int i = 0;
        System.out.println(i+'0');
        i += i ++ + ++ i;
        System.out.println(i);
        System.out.println(s);
//
//        int k = 2;
//        int m = 10;
//        int s =  1 >> k++ + ++m - --k - m-- << 1;
//        int s =  1 >> 0 << 1;
//        int s =   k++ + ++m >> 1;
//
//
//        System.out.println("s = " + s);
//        System.out.println("k = " + k);
//        System.out.println("m = " + m);
//
//        int d = 1;
//        int b = d++;
//        int c = -d;
//        System.out.print(d);
//        System.out.print(b);
//        System.out.print(c);
//
//        int i = new Integer(10);


//        TreeSet<Item> set = new TreeSet<Item>();
//        set.add(new Item(2));
//        set.add(new Item(2));
//        set.add(new Item(3));
//        System.out.println(set);
//
//        Boolean b = new Boolean("/true");
//        System.out.println(b);

        Item[] students = new Item[3];
        students[0] = new Item(1);
        students[1] = new Item(0);
        students[2] = new Item(2);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }

    static class Item implements Comparable {

        int n;

        Item(int n) {
            this.n = n;
        }

        public String toString() {
            return "Item " + n;
        }

        @Override
        public int compareTo(Object o) {
            Item currentItem = (Item) o;
            if (this.n < currentItem.n){
                return  -1;
            }else if (this.n > currentItem.n){
                return 1;
            }else{
                return 0;
            }
        }
    }
}

