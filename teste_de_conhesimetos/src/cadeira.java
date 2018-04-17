public class cadeira  implements Icadeira{
    private double pernas;
    private double peso_suportado;
    private double apoios;


    public cadeira(double pernas, double peso_suportado, double apoios) {
        setPeso_suportado(peso_suportado);
        setApoios(apoios);
        setPernas(pernas);
    }
    @Override
    public double getPernas() {
        return pernas;
    }

    public void setPernas(double pernas) {
        this.pernas = pernas;
    }
    @Override
    public double getPeso_suportado() {
        return peso_suportado;
    }

    public void setPeso_suportado(double peso_suportado) {
        this.peso_suportado = peso_suportado;
    }
    @Override
    public double getApoios() {
        return apoios;
    }

    public void setApoios(double apoios) {
        this.apoios = apoios;
    }
    @Override
    public double getPesoPorPerna() {

        return this.getPeso_suportado()/this.getPernas();
    }
}
