import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Variables
        String nombreEstudiante = "Perdido Sin Rumbo";
        String nombreAsignatura = "Estructura de Datos";
        double[] ponderacion = {0.3, 0.3, 0.4};
        int cantidad = ponderacion.length;
        double[][] intervalo = {
            {4.5, 5},
            {4.0, 4.5},
            {3.5, 4.0},
            {3.0, 3.5},
            {0.0, 3.0}
        };
        String[] intervaloStrings = {
            "[4.5 - 5.0]",
            "[4.0 - 4.5)",
            "[3.5 - 4.0)",
            "[3.0 - 3.5)",
            "[0.0 - 3.0)"
        };
        String[] rendimientoStrings = {
            "EXCELENTE",
            "MUY BUENO",
            "BUENO",
            "DEFICIENTE",
            "INSUFICIENTE",
        };
        double calificacion = 0;
        double[] calificaciones = new double[cantidad];
        double resultado = 0;
        int indice = 0;

        // Input
        Scanner scanner = new Scanner(System.in);
        boolean inputValido = false;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la " + String.valueOf(i+1) + "° calificación:");
            do {
                if (!scanner.hasNextDouble()) {
                    inputValido = false;
                    System.out.println("No ha ingresado un número. Por favor, ingrese un número entre 0 y 5:");
                    scanner.nextLine();
                } else {
                    calificacion = scanner.nextDouble();
                    if (verificarEntre(calificacion, 0 , 5)) {
                        inputValido = true;
                    } else {
                        inputValido = false;
                        System.out.println("Número inválido. Por favor, ingrese un número entre 0 y 5:");
                    }
                }
            } while (!inputValido);
            calificaciones[i] = calificacion;
        }

        // Cálculo
        for (int i = 0; i < cantidad; i++) {
            resultado += ponderacion[i] * calificaciones[i];
        }

        // Rangos
        for (int i = 0; i < 5; i++) {
            if (verificarEntre(resultado, intervalo[i][0], intervalo[i][1])) {
                indice = i;
                break;
            }
        }

        //Output
        scanner.close();
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("La calificación definitiva del estudiante " + nombreEstudiante
            + " en la asignatura " + nombreAsignatura + " es " + String.valueOf(resultado) + ".");
        System.out.println("Su calificación definitiva pertenece al intervalo " + intervaloStrings[indice]
            + ", razón por la cual su rendimiento es considerado " + rendimientoStrings[indice] + ".");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("");

    }

    public static boolean verificarEntre(double x, double min, double max) {
        return (min <= x && x <= max);
    }
}
