package figurageometrica;

public class Circulo {
        //atributos
        private double lado;
        //metudos
        Circulo(double lado){
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
        public double getRaio() {

            return this.lado;
        }
        public double getAria() {
            return Math.PI*Math.pow(this.getRaio(), 2);
        }
        public double getPerimetro() {
            return Math.PI*getRaio();
        }
    }
