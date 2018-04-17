package figurageometrica;

public class Retangulo {
    private double lado;
    private double base;

    Retangulo(double lado, double base){
        this.setLado(lado);
        this.setBase(base);
    }
    Retangulo(){
        this.setLado(1);
        this.setBase(1);
    }

    public void setLado(double lado) {

        if (lado>0) {
            this.lado = lado;
        }
        else {
            System.out.println("ERRO!!");
        }
    }
    public void setBase(double lado) {

        if (base>0) {
            this.base = base;
        }
        else {
            System.out.println("ERRO!!");
        }
    }

    public double getLado() {

        return this.lado;
    }
    public double getBase() {

        return this.lado;
    }
    public double getAria() {
        return this.getLado()*this.getBase();
    }
    public double getPerimetro() {
        return this.getLado()+this.getLado()+this.getLado()+this.getLado();
    }
}
