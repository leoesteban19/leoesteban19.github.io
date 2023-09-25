package clasejava;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingrese un número entre 0 y 9,999: ");
        int numero = scanner.nextInt();
       
        if (numero >= 0 && numero <= 9999) {
            String numeroStr = String.valueOf(numero);
            int cantidadCifras = numeroStr.length();

            System.out.println("El número " + numero + " tiene " + cantidadCifras + " cifras.");
        } else {
            System.out.println("El número no pertenece al rango solicitado.");
        }

        scanner.close();
    }
}