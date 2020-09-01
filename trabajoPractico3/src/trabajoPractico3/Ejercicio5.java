package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Main.titulo("Determinar si un número es perfecto");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número entero positivo: ");
		int num = scanner.nextInt();
		esPerfecto(num);
		scanner.close();
	}
	
	
	public static void esPerfecto(int num) {
		System.out.printf("La suma de los divisores de %d es: ", num);
		int sum = 0;
		for (int i = 1; i <= num/2+1; i++) {
			if (num % i == 0) {
				sum += i;
				System.out.printf("+ %d ", i);
			}
		}
		System.out.printf("= %d%n", sum);
		if (sum == num) System.out.printf("El número %d es perfecto", num);
		else System.out.printf("El número %d no es perfecto.", num);
	}
	
}
