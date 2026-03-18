
/**
 *
 * @author renato
 */
public class Perecedero extends Producto{
    
    
    private int diasVencimiento;
    
    public Perecedero(String codigo, String nombre, double precio, int diasVencimiento){
        super(codigo, nombre, precio);
        this.diasVencimiento = diasVencimiento;
    }

    @Override
    public double calcularPreciofinal() {
       //Si vence en menos de 2 dias => descuento de 50%.
       //if(this.diasVencimiento <= 2)
       //    return this.precio * 0.5 ;
                  
       //return precio;
       
       return (this.diasVencimiento <= 2) ? getPrecio() * 0.5 : getPrecio();
    }

    @Override
    public String getTipoProducto() {
        return "PERECEDERO";
    }  
}
