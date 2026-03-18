

/**
 *
 * @author renato
 */
public class PagoEfectivo extends Pago{
    
     PagoEfectivo(double monto) {
        super(monto);
    }


    @Override
    public  void pagar(){
        System.out.println("- Metodo de Pago Efectivo");
        System.out.println(" - Monto a cobrar en Bs. " + monto);
        System.out.println("");
    }
    
}