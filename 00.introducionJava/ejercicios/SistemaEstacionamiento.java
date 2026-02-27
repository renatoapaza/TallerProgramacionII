import java.util.Scanner;

/**
 * Ejercicio: Sistema de Estacionamiento
 * Propósito: Gestionar cobros múltiples y generar un reporte diario.
 * Conceptos: Bucle while, centinela (FIN), acumuladores, contadores y Switch moderno.
 */
public class SistemaEstacionamiento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // --- VARIABLES DE REPORTE (Contadores y Acumuladores) ---
        int contHora = 0;
        int contMediaJornada = 0;
        int contJornadaCompleta = 0;
        double sumaIngresosTotal = 0;

        System.out.println("=== CONTROL DE CAJA - ESTACIONAMIENTO ===");

        // --- BUCLE DE CARGA DE DATOS ---
        // El bucle continuará hasta que se ingrese "FIN"
        while (true) {
            System.out.print("\nIngrese la placa del vehículo (o 'FIN' para cerrar el día): ");
            String placa = teclado.next();

            // Condición de parada: si la placa es "FIN", salimos del bucle
            if (placa.equalsIgnoreCase("FIN")) {
                break;
            }

            // Menú de tipos de estacionamiento
            System.out.println("Tipos de servicio: ");
            System.out.println("1. Por hora (Bs. 3)");
            System.out.println("2. Media jornada (Bs. 15 - 5% Desc)");
            System.out.println("3. Jornada completa (Bs. 30 - 10% Desc)");
            System.out.print("Seleccione una opción: ");
            int tipo = teclado.nextInt();

            double montoAPagar = 0;

            // --- PROCESAMIENTO DE COBRO ---
            if (tipo == 1) {
                // Opción por hora
                System.out.print("¿Cuántas horas permaneció?: ");
                int horas = teclado.nextInt();
                montoAPagar = horas * 3;
                contHora = contHora + 1; // Incrementamos contador

            } else if (tipo == 2) {
                // Opción media jornada (Descuento del 5%)
                // Cálculo: 15 * 0.95 equivale a restar el 5%
                montoAPagar = 15 * 0.95;
                contMediaJornada = contMediaJornada + 1;

            } else if (tipo == 3) {
                // Opción jornada completa (Descuento del 10%)
                // Cálculo: 30 * 0.90 equivale a restar el 10%
                montoAPagar = 30 * 0.90;
                contJornadaCompleta = contJornadaCompleta + 1;

            } else {
                // Validación para opciones incorrectas
                System.out.println("⚠️ Opción no válida. Intente de nuevo.");
                continue; // Salta el resto del código y vuelve al inicio del bucle
            }

            // Acumulamos el monto en el total general
            sumaIngresosTotal += montoAPagar;
            System.out.println("Cobro registrado para placa [" + placa + "]: Bs. " + montoAPagar);
        }

        // --- SALIDA DE RESULTADOS (Reporte Final) ---
        System.out.println("\n========================================");
        System.out.println("        REPORTE FINAL DEL DÍA           ");
        System.out.println("========================================");
        System.out.println("Estacionamientos por hora:      " + contHora);
        System.out.println("Estacionamientos media jornada: " + contMediaJornada);
        System.out.println("Estacionamientos jornada completa: " + contJornadaCompleta);
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL INGRESOS DEL DÍA:  Bs. %.2f\n", sumaIngresosTotal);
        System.out.println("========================================");

        teclado.close();
    }
}