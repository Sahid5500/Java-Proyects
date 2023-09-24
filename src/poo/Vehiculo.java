package poo;

public class Vehiculo {
    // 1.) Atributos
           protected String fabricante;
            String modelo;
            double cc;
            int year;
            boolean sport;
            int speed;
    // 2.) Constructores
        public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
                this.fabricante = fabricante;
                this.modelo = modelo;
                this.cc = cc;
                this.year = year;
                this.sport = sport;
                this.speed = 0;
        }

        public Vehiculo(String fabricante, String modelo){
            this.fabricante = fabricante;
            this.modelo = modelo;
        }

    public Vehiculo() {
    }
    // 3.) Metodos (Comportamiento

            public void acelerar(int quantity) {
            this.speed += quantity;
            }

}
