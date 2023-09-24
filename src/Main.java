public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String Mensaje = "Hola Mundo";
        System.out.println(Mensaje.length());
        String MensajeMay = Mensaje.toUpperCase();
        System.out.println(MensajeMay);

        String Otro = "HOLA MUNDO";
        if (MensajeMay.equals(Otro)){
            System.out.println("Verdadero");
        }else System.out.println("Falso");
    }
}