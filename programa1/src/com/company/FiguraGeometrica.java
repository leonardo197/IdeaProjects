package com.company;

public class FiguraGeometrica {


    private String nome;

    FiguraGeometrica(){
        setNome("Figura");
    }
    FiguraGeometrica(String nome){
        setNome(nome);
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome() {
        return this.nome;
    }

}
