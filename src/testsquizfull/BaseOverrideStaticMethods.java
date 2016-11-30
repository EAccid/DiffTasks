package testsquizfull;

abstract class BaseOverrideStaticMethods {

    public void test() {
//    public static void test() { //error in sub class
        System.out.println("base test");
    }

    abstract void testAbstract();
}


class OverrideStaticMethods extends BaseOverrideStaticMethods {

    @Override
    void testAbstract() {

    }

    @Override
    public void test() {
        super.test();
    }

}