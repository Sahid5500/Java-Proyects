package Herencias;

import poo.Vehiculo;

public class Moto extends Vehiculo {
    public Moto(String fabricante, String modelo, double cc, int year, boolean sport) {
        super(fabricante, modelo, cc, year, sport);
    }

    public Moto(){
        boolean baul;
        this.fabricante = "Suzuki";


    }
}
