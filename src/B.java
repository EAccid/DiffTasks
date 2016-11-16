public class B extends A {

    public B() {
        System.out.print("Empty");
    }

    public B(String s) {
        System.out.print(s);
    }

}

class A {

    public A() {
    }

    public A(String s) {
        System.out.print("AA");
    }

    public static void main(String[] args) {
        new B("AB");
    }
}


