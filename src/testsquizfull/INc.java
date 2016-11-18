package testsquizfull;

public class Inc {

    public static void main(String[] args) {
        int i = 5;
        System.out.println(++i + ++i); //13

        i = 5;
        System.out.println(++i + i++); //12

        i = 5;
        System.out.println(i++ + i++); //11

    }
}
