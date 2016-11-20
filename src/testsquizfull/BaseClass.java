package testsquizfull;

public class BaseClass {
    static {
        System.out.println("from static BaseClass");
    }

    String variable;

    {
        System.out.println("from non static BaseClass");
    }

    public BaseClass() {
        System.out.println("from construct BaseClass");
        printVariable();
    }

    public static void main(String[] args) {
        System.out.println("Start from p s v m! BaseClass");
        SubClass b = new SubClass();
    }

    protected void printVariable() {
        System.out.println("from printVariable BaseClass");
        variable = "variable is initialized in BaseClass Class";
    }
}

class SubClass extends BaseClass {
    static int testStaticVar = 0;

    static {
        System.out.println("from static SubClass,  testStaticVar - " + testStaticVar);
    }

    String variable = null;
    int testVar = 0;

    {
        System.out.println("from non static SubClass,  testVar - " + testVar);
    }

    public SubClass() {
        System.out.println("from construct SubClass,  testStaticVar - " + testStaticVar);
        System.out.println("from construct SubClass,  testVar - " + testVar);
        System.out.println("variable value = " + variable);
    }

    protected void printVariable() {
        testVar = 1;
        testStaticVar = 1;
        System.out.println("from printVariable SubClass,  testVar - " + testVar);
        variable = "variable is initialized in SubClass Class";
    }
}
