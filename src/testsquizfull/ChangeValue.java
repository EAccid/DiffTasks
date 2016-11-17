package testsquizfull;

public class ChangeValue {

    public static void main(String[] args) {

        int a = -5;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
