public class GuessANumber extends Thread {
    private int number_i;
    private int number_f;
    private int total;

    public GuessANumber(int number_i, int number2_f) {
        this.number_i = number_i;
        this.number_f = number2_f;
    }

    public int getNumber_f() {
        return number_f;
    }

    public int getNumber_i() {
        return number_i;
    }

    public int getTotal() {
        return this.total;
    }

    public void run() {//----------------------gerador dde simas
        this.total = this.number_i;
        for (int i = this.number_i; i <= (this.number_f); i++) {
            this.total += i;
            System.out.println("soma de " + this.getName() + "esta em:" + getTotal());
        }

    }
}