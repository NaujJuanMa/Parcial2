public abstract class Producto {

    protected String nombre ;
    protected String marca ;
    protected Double precio ;
    protected int cantidadStock ;

    public abstract void mostrarDetalles();


    public Producto() {
    }

    public Producto(String nombre, String marca, Double precio, int cantidadStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public double calcularPrecioVenta(int cantidad) {
        double precioTotal = getPrecio() * cantidad;
        if (cantidad > 5) {
            precioTotal *= 0.9;
        }
        return precioTotal;
    }
}
