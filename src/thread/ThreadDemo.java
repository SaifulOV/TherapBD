package thread;

class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating Thread : " + threadName);
    }

    @Override
    public void start() {
        System.out.println("Starting Thread : " + threadName);
        super.start();
    }

    @Override
    public void run() {
        System.out.println("Running Thread : " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Count : " + i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "Interrupted");
        }
        System.out.println("Thread " + threadName + "   exiting");
    }


}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Demo Thread");
        myThread.start();
    }
}
