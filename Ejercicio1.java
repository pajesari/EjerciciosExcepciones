import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileNotFoundException;

public class Ejercicio1{
    public static void main(String [] args){
        File arch = new File("entrada.txt");
        Scanner teclado = null;
        int a, b;
        
        try{
            teclado= new Scanner(arch);
            System.out.println("Escribe el primer numero: ");
            a = teclado.nextInt();
            System.out.println("Escribe el segundo Número:");
            b = teclado.nextInt();
            System.out.println("La división es:" + a/b);
        }
        catch(InputMismatchException e){
            System.out.println("Entrada no valida");
        }
        catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
        catch(FileNotFoundException e){
            System.out.println("Archivo no encintrado");
        }
        finally{
            if(teclado != null){
            teclado.close();
            }
        }
    }
}