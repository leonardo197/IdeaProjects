package com.company;

public class quadrado  extends FiguraGeometrica{

    private double lado;

    quadrado(double lado){
        this.setLado(lado);
    }
    public void setLado(double lado) {

        if (lado>0) {
            this.lado = lado;
        }
        else {
            System.out.println("ERRO!!");
        }
    }

    public double getLado() {

        return this.lado;
    }
    public double getAria() {
        return this.getLado()*this.getLado();
    }


}
