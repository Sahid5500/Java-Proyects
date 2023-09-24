package poo;

import Herencias.Moto;

public class Main {
    public static void main(String[] args) {
        // Clase identificador = new clase(); llamada al constructor

        Vehiculo Camaro = new Vehiculo("Ford", "Transformers", 6.2, 2007, true);

        System.out.println(Camaro.speed);
        Camaro.acelerar(50);
        System.out.println(Camaro.speed);

        Moto Sx = new Moto();
        Sx.fabricante = "";
    }


}
