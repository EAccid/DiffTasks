package testsquizfull;

class Test <X extends Object> {

    private X x;

    public Test(X x) {
        this.x = x;
    }

    public double getDouble() {
//        return ((Double ) x).doubleValue(); //ClassCastException
        return ((Number ) x).doubleValue();
    }
    public static void main(String args[]) {

        Integer integer = new Integer(1);
        Double doubl = integer.doubleValue();


        Test<Integer> a = new Test<>(integer);
        System.out.print(a.getDouble());

    }

}
