# Sistema de Facturación de Supermercado
## Contexto Real
Un supermercado necesita un sistema de facturación que maneje diferentes tipos de productos: perecederos (con fecha de vencimiento), electrónicos (con garantía), y ropa (con tallas). Todos los productos deben poder facturar desde una caja única que no distinga el tipo específico.

## Problemas a Resolver
- Crear clase abstracta Producto con atributos encapsulados y 3 constructores. Crear 3 subclases concretas que implementen los métodos abstractos.
- Instanciar 9 productos: 3 perecederos (leche, yogur, carne), 3 electrónicos (radio, licuadora, celular), 3 ropas (camisa, pantalón, chaqueta). Usar constructores variados.
- Implementar clase CajaRegistradora con:
  - Atributo **Producto[]** productosEscaneados (máximo 50);
  - Método e**scanearProducto(Producto p)** (polimórfico, acepta cualquier producto)
  - Método **calcularTotal()** que sume calcularPrecioFinal() de cada producto sin usar instanceof
  -  Método **generarTicket()** que muestre: código, nombre, tipo (polimórfico), precio base, precio final
- Sobrecargar **procesarDevolucion()** en CajaRegistradora: con Producto p (devolución simple), con Producto p, String motivo, con Producto p, boolean tieneTicket, String motivo.
- Implementar **inventarioPorTipo(Producto[] inventario)** que recorre el arreglo y muestre cuántos hay de cada tipo usando únicamente getTipoProducto().