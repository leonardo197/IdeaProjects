package main;

public class thread_debito extends Thread {

    private conta conta;

    public thread_debito(conta saldoi) {
        this.conta=saldoi;
    }



    public void run() {//----------------------gerador de numeros aliatorios


        int des;
        int sl=conta.getSalo();
        do {
            synchronized (conta) {
                des = (int) (Math.random() * 50 + 1);
                sl=conta.getSalo();
                sl -= des;
                System.out.println(getName() + " saldo antigo: " + conta.getSalo() + " menus " + des + " saldo atual: " + sl);
                conta.setSalo(des);
            }
        } while(conta.getSalo() >=0);

    }
}
