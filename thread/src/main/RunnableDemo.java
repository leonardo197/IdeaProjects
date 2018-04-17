package main;

public class RunnableDemo implements Runnable {

    private Thread t;
    private final String threadName;
    private double ii;
    private double o;


    RunnableDemo(String name, double in,double oo) {
        threadName = name;
        ii=in;
        o=oo;
        System.out.println("Creating " + threadName);
    }

    public void run() {

        System.out.println("Running " + threadName);
           if (o==1){
               for ( int i= 100; i >= this.ii ; i--) {
                   System.out.println("Thread: " + threadName + ", " + i);

               }
          }else
         {
             for ( int i= 0; i <= this.ii ; i++) {
                 System.out.println("Thread: " + threadName + ", " + i);

             }
          }
        System.out.println("Thread " + threadName + " exiting.");
            }


    public void start () {
        System.out.println("Starting " + threadName);
        if (t==null) {
            t = new Thread (this,threadName);
            t.start();
        }
    }

}