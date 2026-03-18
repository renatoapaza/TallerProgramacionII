public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pago pagoEfectivo = new PagoEfectivo(234.9);
        Pago pagoTarjeta = new PagoTarjeta(12.45, "234-456-2333");
        
        pagoEfectivo.pagar();
        pagoTarjeta.pagar();
        
        pagoEfectivo.pagar("Efectivo");
        pagoTarjeta.pagar("Tarjeta");
        
    }
    
}