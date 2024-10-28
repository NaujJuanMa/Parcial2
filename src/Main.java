import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Laptop X", "Marca A", 1000.0, 10, "Intel i7", 16);
        Celular celular1 = new Celular("Celular Y", "Marca B", 500.0, 20, 4000, 48);

        Cliente cliente1 = new Cliente("Juan Perez", "juan.perez@gmail.com");
        Cliente cliente2 = new Cliente("Maria Gomez", "maria.gomez@gmail.com");

        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 6);

        cliente2.comprarProducto(laptop1, 2);
        cliente2.comprarProducto(celular1, 1);

        System.out.println("\nResumen de compras:");
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        laptop1.setCantidadStock(laptop1.getCantidadStock() - 5);
        celular1.setCantidadStock(celular1.getCantidadStock() - 7);

        System.out.println("\nInventario actualizado:");
        System.out.println("Laptop X - Cantidad en Stock: " + laptop1.getCantidadStock());
        System.out.println("Celular Y - Cantidad en Stock: " + celular1.getCantidadStock());
    }
}
