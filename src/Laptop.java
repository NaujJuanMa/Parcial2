public class Laptop extends Producto implements Vendible{

    private String procesador;
    private int memoriaRam;

    public Laptop (String nombre, String marca, Double precio, int cantidadStock, String procesador, int memoriaRam){
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" NOMBRE: "+ getNombre() + " MARCA: " + getMarca() + " PRECIO: " + getPrecio() + " CANTIDAD DE STOCK: " + getCantidadStock() + " PROCESADOR: " + getProcesador() + " MEMORIARAM: " + getMemoriaRam());
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double preciofinal = getPrecio() * cantidad;
        if (cantidad > 5) {
            preciofinal *= 0.9;
        }
        return preciofinal;

    }
}
