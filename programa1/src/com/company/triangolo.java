package com.company;

public class triangolo extends FiguraGeometrica {
    //atributos
    private double lado;
    private double base;
    //metudos
    triangolo(double lado,double base){
        this.setLado(lado);
        this.setBase(base);
    }
    public void setLado(double lado) {

        if (lado>0) {
            this.lado = lado;
        }
        else {
            System.out.println("ERRO!!");
        }
    }
    public void setBase( double base) {

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

        return this.base;
    }
    public double getAria() {
        return (this.getLado()*this.getBase())/2;
    }
}

