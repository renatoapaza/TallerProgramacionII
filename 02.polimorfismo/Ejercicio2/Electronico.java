
/**
 *
 * @author renato
 */
public class Electronico extends Producto{

    private int mesesGarantia;
    
    public Electronico(String codigo, String nombre, double precio, int mesesGarantia){
        super(codigo, nombre, precio);
        this.mesesGarantia = mesesGarantia;
    }
    
    @Override
    public double calcularPreciofinal() {
        // aplicar impuesto IVA
        return getPrecio() * 0.13;
    }

    @Override
    public String getTipoProducto() {
        return "ELECTRONICO";
    }
    
}
