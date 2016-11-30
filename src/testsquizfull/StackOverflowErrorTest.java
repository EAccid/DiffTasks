package testsquizfull;

public class StackOverflowErrorTest {

    StackOverflowErrorTest b = new StackOverflowErrorTest();

    public static void main(String[] args) {
        StackOverflowErrorTest b = new StackOverflowErrorTest();
        b.show();
    }

    public int show() {
        return (true ? null : 0);
    }

}

