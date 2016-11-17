package testsquizfull;

public class BConstructors extends A {

    public BConstructors() {
        System.out.print("Empty");
    }

    public BConstructors(String s) {
        System.out.print(s);
    }

}

class A {

    public A() {
    }

    public A(String s) {
        System.out.print("testsquizfull.AA");
    }

    public static void main(String[] args) {
        new BConstructors("AB");
    }
}


