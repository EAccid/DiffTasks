package multithreading.thread;

public class Thread4 extends Thread {
    @Override
    public void run() {
        System.out.println("tread 4 is running.");
        for(int i = 0; i < 5; i++){
            try {
                System.out.println("thread 4: step "+ i);
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(" --- thread 4 has stopped.");
    }
}
