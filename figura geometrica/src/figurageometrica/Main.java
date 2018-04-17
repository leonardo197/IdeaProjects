package figurageometrica;

class Main {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,4);
        Retangulo r2 = new Retangulo();

        r2.setLado(5);
        r2.setBase(2);

        Circulo c1 =new Circulo(3);

        Quadrado q1 =new Quadrado(5);

        Triangulo t1 =new Triangulo(10,4);//autura base




        System.out.println("Retangulo 1 area: "+r1.getAria()+" Perimetro: "+r1.getPerimetro());
        System.out.println("Retangulo 2 area: " +r2.getAria()+" Perimetro: "+r2.getPerimetro());
        System.out.println("Circulo 1 area: "+ c1.getAria()+" Perimetro: "+c1.getPerimetro());
        System.out.println("Quadrado 1 area: "+ q1.getAria()+" Perimetro: "+q1.getPerimetro());
        System.out.println("Triangulo 1 area: "+ t1.getAria()+" Perimetro: "+t1.getPerimetro());

        t1.TrocaAluturaBase();
        System.out.println("Triangulo 1 area: "+t1.getAria()+" Perimetro: "+t1.getPerimetro());
    }
}
