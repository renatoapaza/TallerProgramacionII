
/**
 *
 * @author renato
 */
public class Ropa extends Producto{
    
    private String talla;
    
    public Ropa(String codigo, String nombre, double precio, String talla){
        super(codigo, nombre, precio);
        this.talla = talla;
    }
    
    @Override
    public double calcularPreciofinal() {
        return getPrecio() ;
    }

    @Override
    public String getTipoProducto() {
        return "ROPA";
    }
}
