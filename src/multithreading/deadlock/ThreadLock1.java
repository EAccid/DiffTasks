package multithreading.deadlock;

public class ThreadLock1 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 25; i++) {
            synchronized (String.class) {
                System.out.println("1: " + i + " lock on String.class object");
                synchronized (Integer.class) {
                    System.out.println("1: " + i + " lock on Integer.class object");
                }
            }
        }
    }
}
