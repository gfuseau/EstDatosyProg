package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main() {
		Main.titulo("Calcular la n-ésima potencia de un número entero");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la base entera: ");
		int x, n;
		x = scanner.nextInt();
		
		do {
			System.out.print("Ingrese el exponente positivo y entero: ");
			n = scanner.nextInt();
		} while (n < 1);
		
		int resultado = calcularPotencia(x, n);
		System.out.printf("%d ^ %d = %d", x, n, resultado);
		scanner.close();
	}
	
	public static int calcularPotencia(int base, int exponente) {
		int potencia = base;
		for (int i = 1; i < exponente; i++) {
			potencia *= base;
		}
		return potencia;
	}
}
