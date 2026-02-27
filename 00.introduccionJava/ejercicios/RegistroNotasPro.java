import java.util.Scanner;

/**
 * Ejercicio: Registro de Notas "Final Pro"
 * Propósito: Gestionar estadísticas académicas y encontrar el rendimiento máximo.
 * Conceptos: Bucle while, contadores, comparación de mayor y centinela (FIN).
 */
public class RegistroNotasPro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- VARIABLES DE ESTADÍSTICA ---
        int aprobados = 0;
        int reprobados = 0;
        int notaMasAlta = -1; // Iniciamos en -1 para que cualquier nota (0-100) sea mayor
        String mejorAlumno = "Nadie";

        System.out.println("=== REGISTRO DE NOTAS FINAL PRO ===");

        // --- BUCLE DE CARGA ---
        while (true) {
            System.out.print("Nombre del alumno (o 'FIN' para terminar): ");
            String nombre = teclado.next();

            // Condición de salida
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.print("Nota final (0-100) de " + nombre + ": ");
            int nota = teclado.nextInt();

            // 1. Contar aprobados y reprobados
            if (nota >= 51) {
                aprobados++;
            } else {
                reprobados++;
            }

            // 2. Lógica para encontrar la nota más alta (Máximo)
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
                mejorAlumno = nombre;
            }
        }

        // --- SALIDA DE RESULTADOS ---
        // Verificamos si se ingresó al menos un alumno para evitar reportes vacíos
        if (aprobados + reprobados > 0) {
            System.out.println("\n--- Estadísticas Finales ---");
            System.out.println("Cantidad de Aprobados: " + aprobados);
            System.out.println("Cantidad de Reprobados: " + reprobados);
            System.out.println("Mejor alumno: " + mejorAlumno + " (Nota: " + notaMasAlta + ")");
        } else {
            System.out.println("\nNo se registraron datos de alumnos.");
        }

        teclado.close();
    }
}