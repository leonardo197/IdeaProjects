package figurageometrica;

public class Quadrado extends Retangulo {

    Quadrado(double lado){
        this.setLado(lado);
        this.setBase(lado);
    }
    Quadrado(){
        this.setLado(1);
        this.setBase(1);
    }

}
