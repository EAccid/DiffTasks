package thinkinginjava;

public class TestVar {
    int j;

    public static void main(String[] args) {
        TestVar testVar = new TestVar();
        testVar.initVars();
    }

    void initVars() {

        int і;
//        і ++; // error
        j++; //OK
    }

    void initArrayss() {

        int[] a;
        int[] as = new int[10]; //size

    }
}
