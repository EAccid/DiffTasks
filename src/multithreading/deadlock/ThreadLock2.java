package multithreading.deadlock;

public class ThreadLock2 implements Runnable {

    @Override
    public void run() {

//     to prevent deadlock: provide an ordered access (such as ThreadLock1)

        for (int i = 0; i < 25; i++) {
//            synchronized (String.class) { //prevent deadlock
            synchronized (Integer.class) {//cause deadlock
                System.out.println("2: "+i+" lock on Integer.class object");
//                synchronized (Integer.class) { //prevent deadlock:
                synchronized (String.class) { //cause deadlock
                    System.out.println("2: "+i+" lock on String.class object");
                }
            }
        }
    }
}
