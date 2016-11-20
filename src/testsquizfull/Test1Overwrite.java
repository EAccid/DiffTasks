package testsquizfull;

public class Test1Overwrite {
    int x = 0;
    void move(int dx) { x += dx; }

    int getX() {
        return x;
    }

    public static void main(String[] args) throws Exception {
        Child test1 = new Child();
        test1.move(1);
        System.out.println(test1.getX());
    }
}

class Child extends Test1Overwrite {
    float x = 0.0f;
    void move(int dx) {
        move((float) dx);
    }
    void move(float dx) {
        x += dx;
    }
//    float getX() {  //compile error
//        return x;
//    }

    int getX() {
        return (int) x;
    }
}