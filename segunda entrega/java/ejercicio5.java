package clasejava;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de sueldos a calcular: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("El número de sueldos debe ser mayor que 0.");
            extracted();
        }

        double sueldoMaximo = Double.MIN_VALUE;
        double sueldoMinimo = Double.MAX_VALUE;
        double sumaSueldos = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();

            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }

            sumaSueldos += sueldo;
        }

        double promedioSueldos = sumaSueldos / N;
 
        System.out.println("Sueldo más alto: " + sueldoMaximo);
        System.out.println("Sueldo más bajo: " + sueldoMinimo);
        System.out.println("Promedio de sueldos: " + promedioSueldos);

        scanner.close();
    }

	private static void extracted() {
	}
}