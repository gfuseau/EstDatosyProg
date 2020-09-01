package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Main.titulo("Imprimir un número al revés");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número entero positivo: ");
		int num = scanner.nextInt();
		
		System.out.printf("El número %d al revés es %d.%n", num, devolverAlReves(num));
		scanner.close();
	}
	
	public static int devolverAlReves(int n) {
		int numeroAlReves = 0;
		while (n != 0) {
			int digito = n % 10;
			numeroAlReves = numeroAlReves * 10 + digito;
			n /= 10;
		}
		return numeroAlReves;
	}
	
}
