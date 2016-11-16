package multithreading.thread;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("tread 2 is running.");
        System.out.println(" --- thread 2 has stopped.");
    }
}
