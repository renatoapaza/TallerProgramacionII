
/**
 *
 * @author renato
 */
public class SistemaFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CajaRegistradora caja = new CajaRegistradora();
        
        Producto [] inventario = {
            new Perecedero("P01", "Leche", 10, 1),      // 0
            new Perecedero("P02", "Yogurt", 5.0, 5),    // 1
            new Perecedero("P03", "Carne", 50.0, 2),    // 2
            new Electronico("E01", "Radio", 300.0, 3),  // 3
            new Ropa("R01", "Camisa", 70.0, "L"),       // 4
        };
        
        for(Producto p : inventario){
            caja.escanearProducto(p);
        }
        // per1.calcularPreciofinal();
        // ropa.calcularPreciofinal();
        
        caja.generarTicket();
        
        
        caja.procesarDevolucion(inventario[3]);
        caja.procesarDevolucion(inventario[1], " Fecha de vencimiento pasado");
        
        caja.inventarioPorTipo();
    }
    
}
