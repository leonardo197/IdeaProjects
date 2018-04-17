package com.company;

public class circulo  extends FiguraGeometrica{
    //atributos
    private double raio;
    //metudos
    circulo(double raio){
        this.setLado(raio);
    }

    public void setLado(double raio) {

        if (raio>0) {
            this.raio = raio;
        }
        else {
            System.out.println("ERRO!!");
        }
    }
    public double getRaio() {

        return this.raio;
    }
    public double getAria() {
        return Math.PI*Math.pow(this.getRaio(), 2);
    }
}