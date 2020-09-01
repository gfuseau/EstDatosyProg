package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Main.titulo("Generar triángulo de números");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número entero no negativo: ");
		int n = scanner.nextInt();
		printTriangle(n);
		scanner.close();
	}
	
	public static void printTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
