package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Main.titulo("Determinar cuántos dígitos se necesitan para escribir un número entero positivo N");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un número entero positivo: ");
		int num = scanner.nextInt();
		int resultado = contarDigitos(num);
		System.out.printf("El número %d tiene %d dígitos.", num, resultado);
		scanner.close();
	}
	
	public static int contarDigitos(int x) {
		int count = 0;
		while (x !=0) {
			x /= 10;
			count++;
		}
		return count;
	}

}
