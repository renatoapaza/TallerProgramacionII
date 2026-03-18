
/**
 *
 * @author renato
 */
public abstract class Pago {
    
    protected double monto;
    
    public Pago(double monto){
        this.monto = monto;
    }
    
    
    public abstract void pagar();
    
    public void pagar(String tipo){
        System.out.println("Pago por " + tipo);
    }
}
