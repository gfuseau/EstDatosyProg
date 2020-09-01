package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio14a {
	
	public static void main(String[] args) {
		Main.titulo("Programa que genera una secuencia rara de números");
		Scanner scanner = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("Ingrese un entero positivo: ");
			input = scanner.nextInt();
		} while (input < 1);
		
		generarSecuencia(input);
		scanner.close();
	}

	public static void generarSecuencia(int input) {
		int limit, num;
		limit = input * 2;
		
		for (int i=1; i<=limit; i += 2) {
			for (int j=1; j<=i; j ++ ) {
				num = (int) Math.pow(i, 2);
				System.out.print(num);
			}
			System.out.print(" ");
		}
	}
	
}
