class Main {

    public static void main(String[] args) {

        cadeira c1 = new cadeira(3, 30, 1);
        cadeira c2 = new cadeira(4, 50, 2);
        cadeira c3 = new cadeira(5, 70, 3);
        cadeira c4 = new cadeira(4, 50, 2);
        c4.setApoios(3);

        System.out.println("numero de pernas: " + c1.getPernas() + " peso suportado: " + c1.getPeso_suportado() + " apoios:" + c1.getApoios() + " pesoque cada perna suporta: " + c1.getPesoPorPerna());
        System.out.println("numero de pernas: " + c2.getPernas() + " peso suportado: " + c2.getPeso_suportado() + " apoios:" + c2.getApoios() + " pesoque cada perna suporta: " + c2.getPesoPorPerna());
        System.out.println("numero de pernas: " + c3.getPernas() + " peso suportado: " + c3.getPeso_suportado() + " apoios:" + c3.getApoios() + " pesoque cada perna suporta: " + c3.getPesoPorPerna());
        System.out.println("numero de pernas: " + c4.getPernas() + " peso suportado: " + c4.getPeso_suportado() + " apoios:" + c4.getApoios() + " pesoque cada perna suporta: " + c4.getPesoPorPerna());

    }
}
