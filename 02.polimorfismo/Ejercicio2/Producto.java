
/**
 *
 * @author renato
 */
abstract class Producto {
    
    private String codigo;
    //protected 
    private String nombre;
    //protected String nombre;
     
    private double precio;
    
    
    // 1
    Producto(){
        this.codigo = "S/C";
        this.nombre = "S/N";
        this.precio = 0;
    }
    
    // 2
    Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // 3
    Producto(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 0;
    }
    
    // metodos abstractos
    
    // 1. MA
    public abstract double calcularPreciofinal();
    
    // 2. FA
    public abstract String getTipoProducto();
    
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
}
