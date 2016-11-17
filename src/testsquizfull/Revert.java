package testsquizfull;

public class Revert {

    public static void main(String[] args) {

        String s = "abcde";

        char[] c = s.toCharArray();
        char mc;
        int length = c.length;
        for (int i = 0; i <= length / 2; i++) {
            mc = c[--length];
            c[length] = c[i];
            c[i] = mc;
        }

        System.out.println(s);
        System.out.println(c);
    }

}
