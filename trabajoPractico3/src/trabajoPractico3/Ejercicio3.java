package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main() {
		Main.titulo("Calcular el producto de dos números enteros positivos mediante sumas sucesivas");
		Scanner scanner = new Scanner(System.in);
		int x, y;
		
		do {
			System.out.print("Ingrese el primer número positivo y entero: ");
			x = scanner.nextInt();
		} while (x < 1);
		do {
			System.out.print("Ingrese el segundo número positivo y entero: ");
			y = scanner.nextInt();
		} while (y < 1);
		
		int resultado = producto(x, y);
		System.out.printf("%d * %d = %d", x, y, resultado);
		scanner.close();
	}
	
	public static int producto(int x, int y) {
		int producto = x;
		for (int i = 1; i < y; i++) {
			producto += x;
		}
		return producto;
	}
	
}
