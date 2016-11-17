package testsquizfull;

class AA { }

class BB extends AA { }

abstract class C {
    abstract void doAction(AA AA);
    void start(AA AA){
        doAction(AA);
    }
}
class D extends C {
    void doAction(AA AA) {
        System.out.println("testsquizfull.AA action");
    }
    void doAction(BB b) {
        System.out.println("testsquizfull.B action");
    }
}
public class Test {
    public static void main(String[] args) {
        new D().start(new BB());
    }
}