package multithreading.thread;

public class MainThread {

    public static void main(String[] args) {

        System.out.println("Main thread 1 is running...");

        int i = 5;
        while (i > 0) {
            System.out.println("thread 1: step "+ i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i--;
        }

        //1.

        Thread thread2 = new Thread(new Thread2());
        thread2.start();


        //2.

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("tread 3 is running.");
                int i = 5;
                while (i > 0) {
                    System.out.println("thread 3: step "+ i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i--;
                }
                System.out.println(" --- thread 3 has stopped.");
            }
        });
        thread3.start();

        Thread thread4 = new Thread4();
        thread4.start();

        Thread daemon  = new ThreadDaemon();
        daemon.setDaemon(true);
        daemon.start();

        System.out.println(" --- main thread 1 has stopped.");


    }

}
