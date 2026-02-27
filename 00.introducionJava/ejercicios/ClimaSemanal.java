import java.util.Scanner;

/**
 * Ejercicio: Monitoreo de Clima Semanal
 * Propósito: Practicar el uso de bucles determinados (for) y cálculos estadísticos.
 */
public class ClimaSemanal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- VARIABLES ---
        double sumaTemperaturas = 0;
        double tempMaxima = -100; // Iniciamos con un valor muy bajo
        int diasCalurosos = 0;
        int totalDias = 7;

        System.out.println("=== SISTEMA DE MONITOREO CLIMÁTICO ===");

        // --- BUCLE FOR ---
        // Sabemos exactamente que son 7 días, por eso usamos for
        for (int i = 1; i <= totalDias; i++) {
            System.out.print("Ingrese la temperatura del día " + i + ": ");
            double tempActual = teclado.nextDouble();

            // 1. Acumular para el promedio
            sumaTemperaturas += tempActual;

            // 2. Buscar la temperatura máxima
            if (tempActual > tempMaxima) {
                tempMaxima = tempActual;
            }

            // 3. Contar días calurosos
            if (tempActual > 30) {
                diasCalurosos++;
            }
        }

        // --- CÁLCULOS Y SALIDA ---
        double promedio = sumaTemperaturas / totalDias;

        System.out.println("\n-------------------------------------------");
        System.out.println("            REPORTE SEMANAL               ");
        System.out.println("-------------------------------------------");
        System.out.printf("Promedio de temperatura: %.2f°C\n", promedio);
        System.out.println("Temperatura más alta: " + tempMaxima + "°C");
        System.out.println("Días con más de 30°C: " + diasCalurosos);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}