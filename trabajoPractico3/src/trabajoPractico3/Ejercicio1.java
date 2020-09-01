package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Main.titulo("Calcular el factorial de un número entero positivo");
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			System.out.println("Ingrese un número entero positivo:");
			input = scanner.nextInt();
		} while (input < 0);
		
		int resultado = calcularFactorial(input);
		System.out.printf("%d! = %d", input, resultado);
		scanner.close();
	}

	public static int calcularFactorial(int n) {
		int factorial = n > 0 ? n : 0;
		for (int i=n-1; i>0; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}
	
}
