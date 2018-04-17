package com.company;

public class Main {

    public static void main(String[] args) {
        quadrado q1 = new quadrado(2);
        circulo c1 =new circulo(2);
        triangolo t1 =new triangolo(3,2);
        c1.setLado(5);
        q1.setLado(5);
        c1.setLado(2);
        q1.setNome("quadrado");


        System.out.println(q1.getAria());
        System.out.println(c1.getAria());
        System.out.println(t1.getAria());
        System.out.println(q1.getNome());
        System.out.println(c1.getNome());
    }


}
