package main;

public class TestThread {

    public static void main(String[]ars) {
        RunnableDemo R1 = new RunnableDemo("Thread_#1" ,0,1);
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Thread_up#2" ,230,2);
        R2.start();

    }
}