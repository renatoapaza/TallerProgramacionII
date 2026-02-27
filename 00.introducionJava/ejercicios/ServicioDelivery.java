import java.util.Scanner;

/**
 * Ejercicio: Servicio de Delivery
 * Propósito: Calcular el costo y tiempo de entrega basado en la distancia en km.
 * Conceptos: Variables (String, double), if-else anidado y formato de salida.
 */
public class ServicioDelivery {

    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer desde la consola
        Scanner teclado = new Scanner(System.in);

        // --- ENTRADA DE DATOS ---
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = teclado.nextLine(); // Usamos nextLine para nombres compuestos

        System.out.print("Ingrese la distancia en km: ");
        double distancia = teclado.nextDouble();

        // Variables para almacenar los resultados del procesamiento
        int costoEnvio = 0;
        int tiempoEstimado = 0;
        boolean distanciaValida = true;

        // --- PROCESAMIENTO (Lógica de rangos) ---
        // Evaluamos la distancia para asignar costo y tiempo
        if (distancia > 0 && distancia <= 2) {
            costoEnvio = 5;
            tiempoEstimado = 15;
        } else if (distancia > 2 && distancia <= 5) {
            costoEnvio = 10;
            tiempoEstimado = 30;
        } else if (distancia > 5 && distancia <= 10) {
            costoEnvio = 18;
            tiempoEstimado = 50;
        } else if (distancia > 10) {
            costoEnvio = 25;
            tiempoEstimado = 90;
        } else {
            // Caso para distancias negativas o cero
            distanciaValida = false;
        }

        // --- SALIDA DE DATOS ---
        System.out.println("\n-------------------------------------------");
        if (distanciaValida) {
            System.out.println("Cliente: " + nombre);
            System.out.println("Costo de envío: Bs. " + costoEnvio);
            System.out.println("Tiempo estimado: " + tiempoEstimado + " minutos");
        } else {
            System.out.println("Error: La distancia ingresada no es válida.");
        }
        System.out.println("-------------------------------------------");

        // Cerramos el recurso
        teclado.close();
    }
}