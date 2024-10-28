public class Celular extends Producto implements Vendible{

    private int capacidadBateria;
    private int resolucionCamara;

    public Celular(String nombre, String marca, Double precio, int cantidadStock, int resolucionCamara , int capacidadBateria ){
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria= capacidadBateria;
        this.resolucionCamara = resolucionCamara;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(int resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(" NOMBRE: "+ getNombre() + " MARCA: " + getMarca() + " PRECIO: " + getPrecio() + " CANTIDAD DE STOCK: " + getCantidadStock() + " CAPACIDADBATERIA: " + getCapacidadBateria() + " RESOLUCIONCAMARA: " + getResolucionCamara());

    }

    @Override
    public double calcularPrecioVenta(int cantidad) {

        double precioFinal = getPrecio() * cantidad;
        if (cantidad > 5) {
            precioFinal *= 0.9;
        }
        return precioFinal;

    }
}
