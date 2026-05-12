import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int[] datos = {1, 2, 3};

        try {
            System.out.println("Escribe el índice del arreglo al que quieres acceder:");
            int indice = teclado.nextInt();

            System.out.println("El valor es: " + datos[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice dado no existe en el arreglo.");
        }
    }
}