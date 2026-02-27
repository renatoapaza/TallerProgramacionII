
import java.util.Scanner;

/**
 * Ejercicio: English School
 * Propósito: Determinar el nivel y horario de clases basado en la edad del alumno.
 * Conceptos: Lectura de datos, condicionales anidados y operadores lógicos.
 * @author renato apaza
 */
public class EnglishSchool {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para capturar lo que el usuario escriba en consola
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DATOS ---
        System.out.println("=== SISTEMA DE INFORMACIÓN - ENGLISH SCHOOL ===");
        System.out.print("Por favor, ingrese la edad del alumno: ");
        int edad = teclado.nextInt();

        // --- PROCESAMIENTO Y SALIDA ---
        // Utilizamos estructuras condicionales para evaluar en qué rango cae la edad
        System.out.println("\n-------------------------------------------");
        
        if (edad >= 4 && edad <= 6) {
            // Rango Kinder
            System.out.println("Nivel: Kinder");
            System.out.println("Días: Lunes y Miércoles");
            System.out.println("Horario: 16:00 a 17:00");

        } else if (edad >= 7 && edad <= 8) {
            // Rango 1st Year
            System.out.println("Nivel: 1st Year");
            System.out.println("Días: Martes y Jueves");
            System.out.println("Horario: 16:30 a 17:30");

        } else if (edad >= 9 && edad <= 10) {
            // Rango 2nd Year
            System.out.println("Nivel: 2nd Year");
            System.out.println("Días: Martes y Jueves");
            System.out.println("Horario: 17:30 a 19:00");

        } else if (edad >= 11 && edad <= 13) {
            // Rango 3rd Year
            System.out.println("Nivel: 3rd Year");
            System.out.println("Días: Lunes y Miércoles");
            System.out.println("Horario: 17:00 a 18:30");

        } else {
            // Manejo de casos fuera de los rangos definidos por la academia
            System.out.println("Aviso: No se encontraron grupos para la edad ingresada.");
            System.out.println("El instituto ofrece clases para niños entre 4 y 13 años.");
        }
        
        System.out.println("-------------------------------------------");

        // Cerramos el scanner para liberar recursos de memoria
        teclado.close();
    }
}