package main;

public class DisplayMessage implements Runnable {
	private String message;

	public DisplayMessage(String message) {
		this.message = message;
	}
    //---------METE A GERAR O  NUMERO
	public void run() {
		while(true) {
			System.out.println(message);
		}
	}
}
