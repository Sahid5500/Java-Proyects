public class Array {
    public static void main(String[] args) {
        int [] notas = new int[10];
        notas[0] = 1;
        notas[1] = 2;
        notas[2] = 3;

        System.out.println(notas[2]);

        int [] Notas2 = {1,2,3,4,5,6,7,8,9};

        // Metodo Loop //

        for (int i = 0; i < Notas2.length; i++) {
            System.out.println(i);
        }
        //Metodo Items //
        for (int items:Notas2){
            System.out.println(items);
        }
    }
}
