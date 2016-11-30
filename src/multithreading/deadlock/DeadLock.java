package multithreading.deadlock;

public class DeadLock {

    public static void main(String[] args) {

        Thread threadLock1 = new Thread(new ThreadLock1());
        threadLock1.start();

        Thread threadLock2 = new Thread(new ThreadLock2());
        threadLock2.start();

    }
}
