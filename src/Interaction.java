import java.util.Scanner;

public class Interaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos años tienes?");
        int Año = scanner.nextInt();

        System.out.println("Tienes" + Año + "años");

    }
}
