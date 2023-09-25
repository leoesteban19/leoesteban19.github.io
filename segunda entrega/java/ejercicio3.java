package clasejava;
import java.util.Scanner;
import java.util.Arrays;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros); 
        System.out.println("Ordenado de menor a mayor: " + Arrays.toString(numeros));

        int[] numerosInverso = new int[5];
        for (int i = 0; i < 5; i++) {
            numerosInverso[i] = numeros[4 - i];
        }
        System.out.println("Ordenado de mayor a menor: " + Arrays.toString(numerosInverso));

        scanner.close();
    }
}
