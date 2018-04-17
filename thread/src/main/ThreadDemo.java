package main;

public class ThreadDemo extends Thread {
    private Thread t;
    private final String threadName;


    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);

        try {
            for (int i = 1; i > 201; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this,threadName);
            t.start();
        }
    }
}

