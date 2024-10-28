import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Vendible> productosComprados;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new ArrayList<>();
    }

    public void comprarProducto(Vendible producto, int cantidad) {
        double precioVenta = producto.calcularPrecioVenta(cantidad);
        System.out.println("Comprando " + cantidad + " unidades de " + ((Producto) producto).getNombre() + " por un total de: $" + precioVenta);
        productosComprados.add(producto);
    }

    public void mostrarCompra() {
        double costoTotal = 0;
        System.out.println("Detalles de la compra de " + nombre + ":");
        for (Vendible producto : productosComprados) {
            ((Producto) producto).mostrarDetalles();
            costoTotal += producto.calcularPrecioVenta(1); // Asumiendo que se muestra el precio de una unidad
            System.out.println();
        }
        System.out.println("Costo total de la compra: $" + costoTotal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Vendible> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Vendible> productosComprados) {
        this.productosComprados = productosComprados;
    }
}
