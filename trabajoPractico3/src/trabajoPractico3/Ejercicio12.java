package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main() {
		Main.titulo("Calcular e^x usando polinomio de Taylor de grado 3");
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("Ingrese un número entero positivo: ");
			input = scanner.nextInt();
		} while (input < 1);
		
		double resultado = exp(input);
		System.out.printf("e^%d = %f", input, resultado);
		scanner.close();
	}
	
	public static double exp(int y) {
		double x = (double) y;
		return 1 + x + (x*x/2) + (x*x*x/6);
	}
	
}
