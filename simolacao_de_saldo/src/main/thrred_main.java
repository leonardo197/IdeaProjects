package main;
public class thrred_main {

    public static void main(String [] args) {

        conta comta = new conta(5000);
        System.out.println("Starting thread1...");
        Thread thread1 = new thread_debito(comta);//-----------COMEcA UMA NOVA thread
        thread1.setName("T-1");
        thread1.start();
        System.out.println("Starting thread2...");
        Thread thread2 = new thread_debito(comta);//-----------COMEcA UMA NOVA thread
        thread2.setName("T-2");
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

/*
		try {
		    Thread.sleep(1);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
*/
        System.out.println("main() is ending...");
    }
}




