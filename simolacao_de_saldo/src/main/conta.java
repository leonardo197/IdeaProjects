package main;

public class conta {
    private int salo;

    public conta(int saldoi) {
        this.salo=saldoi;
    }

    public int getSalo() {
        return this.salo;
    }
    public void setSalo(int salo) {
        this.salo -= salo;
    }
}
