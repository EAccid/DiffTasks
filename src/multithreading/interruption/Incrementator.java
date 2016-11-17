package multithreading.interruption;

//https://habrahabr.ru/post/164487/

import java.util.Arrays;

class Program {
    public static int mValue = 0;

    static Incrementator mInc;

    public static void main(String[] args) {
        mInc = new Incrementator();

        System.out.print("Start incrementation:\n");

        mInc.start();

        for (Thread thread : Thread.getAllStackTraces().keySet()
                ) {
            System.out.println(thread.getName());
        }

        for (int i = 1; i <= 3; i++) {
            try {
//                mInc.join();
                System.out.print(" ---- sleep 2 * 100 from main() " + Program.mValue + "\n");
                Thread.sleep(i * 2 * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mInc.changeAction();
        }

        mInc.interrupt();

        System.out.println(Arrays.asList(
                Thread.currentThread().getStackTrace())
        );

        try
        {
            throw new RuntimeException();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}

public class Incrementator extends Thread {
    private volatile boolean mIsIncrement = true;
    private volatile boolean mIsfinished = false;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    public void finish() {
        mIsfinished = true;
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
//            if (!mIsfinished) {
                if (mIsIncrement) Program.mValue++;
                else Program.mValue--;
                System.out.print(Program.mValue + "\n");
            } else {
                System.out.print("return from run()");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt(); //set flag interrupt true
                System.out.println("incrementator thread  is interrupted - " + Thread.interrupted());
                return; //An infinite loop occurs, if do not return !!!! .stop() - deprecated
            }

            //if this thread join()
            if (Program.mValue == 5) {
                Thread.currentThread().interrupt();
            }
        }
        while (true);
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }


}

