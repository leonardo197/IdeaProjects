
public class soma {
    public static void main(String [] args) {

        System.out.println("Starting thread1...");
        GuessANumber thread1 = new GuessANumber(1,5000);//-----------COMEcA UMA NOVA thread
        thread1.setName("T-1");
        thread1.start();
        System.out.println("Starting thread2...");
        GuessANumber thread2 = new GuessANumber(2,100);//-----------COMEcA UMA NOVA thread
        thread2.setName("T-2");
        thread2.start();

        try {
            thread1.join();
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        try {
            thread2.join();
        }catch(InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println(thread1.getName()+" total:"+thread1.getTotal()+" mais "+thread2.getName()+" total: "+thread2.getTotal()+" total da duas:"+(thread1.getTotal()+thread2.getTotal()));


    }
}
