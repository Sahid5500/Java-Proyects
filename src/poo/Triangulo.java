package poo;

import java.util.Scanner;

public class Triangulo {
    public static double Funcion(double base, double altura) {
        return (base*altura)/2;
    }
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        double Base,Altura,Resultado;

        System.out.println("Ingresa el valor de la Base: ");
        Base = Lector.nextDouble();
        System.out.println("Ingresa el Valor de la Altura");
        Altura = Lector.nextDouble();

        Resultado = Funcion(Base,Altura);
        System.out.println("El resultado es: " + Resultado);
    }
}
