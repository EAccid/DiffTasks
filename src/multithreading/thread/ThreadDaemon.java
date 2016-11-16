package multithreading.thread;

public class ThreadDaemon extends Thread {

    @Override
    public void run() {
        System.out.println("daemon start...");
        for(int i = 0; i < 5; i++){
            try {
                System.out.println("daemon: step "+ i);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" --- daemon has stopped.");
    }
}
