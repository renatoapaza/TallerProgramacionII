import java.util.Scanner;

/**
 * Ejercicio: Pre-aprobación de Crédito Hipotecario
 * Propósito: Evaluar la viabilidad de un crédito según ingresos, edad y deudas.
 * Conceptos: Operadores lógicos, condicionales anidados y manejo de caracteres.
 */
public class PreAprobacionCredito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DATOS ---
        System.out.println("=== SISTEMA DE EVALUACIÓN CREDITICIA ===");
        
        System.out.print("Ingrese la edad del solicitante: ");
        int edad = teclado.nextInt();

        System.out.print("Ingrese el ingreso mensual (Bs): ");
        double ingreso = teclado.nextDouble();

        System.out.print("Ingrese el monto de la cuota deseada (Bs): ");
        double cuota = teclado.nextDouble();

        System.out.print("¿Tiene deudas previas? (S/N): ");
        char tieneDeuda = teclado.next().toUpperCase().charAt(0);

        // --- PROCESAMIENTO DE LÓGICA ---
        
        // Variable para almacenar el mensaje de rechazo o aprobación
        String resultado = "";
        boolean aprobado = true;

        // Requisito 1: Edad entre 18 y 60 años
        if (edad < 18 || edad > 60) {
            aprobado = false;
            resultado = "RECHAZADO (La edad debe estar entre 18 y 60 años)";
        } 
        // Requisito 2 y 3: Evaluación de ingresos vs cuota
        else {
            double ingresoMinimoRequerido;

            if (tieneDeuda == 'S') {
                // Si tiene deudas, requiere el cuádruple (4x)
                ingresoMinimoRequerido = cuota * 4;
                if (ingreso < ingresoMinimoRequerido) {
                    aprobado = false;
                    resultado = "RECHAZADO (Por deudas previas, el ingreso debe ser de al menos Bs. " + ingresoMinimoRequerido + ")";
                }
            } else {
                // Si no tiene deudas, requiere el triple (3x)
                ingresoMinimoRequerido = cuota * 3;
                if (ingreso < ingresoMinimoRequerido) {
                    aprobado = false;
                    resultado = "RECHAZADO (El ingreso debe ser de al menos Bs. " + ingresoMinimoRequerido + ")";
                }
            }
        }

        // --- SALIDA DE RESULTADOS ---
        System.out.println("\n-------------------------------------------");
        if (aprobado) {
            System.out.println("Resultado: ¡CRÉDITO PRE-APROBADO!");
            System.out.println("Cumple con todos los requisitos de riesgo.");
        } else {
            System.out.println("Resultado: " + resultado);
        }
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}