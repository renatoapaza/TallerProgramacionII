
/**
 *
 * @author renato
 */
public class PagoTarjeta extends Pago{
    
    private String numeroTarjeta;
    
    PagoTarjeta(double monto, String numeroTarjeta){
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public  void pagar(){
        System.out.println("- Metodo de Pago Tarjeta (" + numeroTarjeta + ")");
        
        double comision = monto * 0.02; // 2%
        
        System.out.println("> Comision (2%) de Bs. " + comision);
        System.out.println("> Monto de Bs. " + monto);
        System.out.println(" - Total a cobrar en Bs. " + (monto + comision));
        System.out.println("");
    }
}
