import java.util.List;
import java.util.ArrayList;

public class Concesionario {
    private List<Vehiculo> inventario = new ArrayList<>(); // Lista de vehículos disponibles
    private List<Venta> ventas = new ArrayList<>(); // Lista de ventas realizadas

    // Método para agregar un vehículo al inventario
    public void agregarVehiculo(Vehiculo vehiculo) {
        inventario.add(vehiculo);
    }

    // Método para realizar una venta de un vehículo
    public void realizarVenta(String codigoVehiculo, double monto, String apellido, String nombre, String documento) {
        Vehiculo vehiculoVendido = null;

        // Buscar el vehículo en el inventario
        for (Vehiculo v : inventario) {
            if (v.getCodigo().equals(codigoVehiculo)) {
                vehiculoVendido = v;
                break;
            }
        }

        // Registrar la venta si se encuentra el vehículo
        if (vehiculoVendido != null) {
            Venta nuevaVenta = new Venta(monto, vehiculoVendido, apellido, nombre, documento);
            ventas.add(nuevaVenta);
            inventario.remove(vehiculoVendido);

            System.out.println("Venta realizada (ID " + nuevaVenta.getIdVenta() + "): " +
                    nombre + " " + apellido + " ha comprado " +
                    vehiculoVendido.getMarca() + " (" + codigoVehiculo + ")");
        } else {
            System.out.println("Error: Vehículo con código " + codigoVehiculo + " no encontrado.");
        }
    }

    // Método para mostrar el inventario actual
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        if (inventario.isEmpty()) {
            System.out.println("No hay vehículos disponibles.");
        }
        for (Vehiculo v : inventario) {
            System.out.println(v);
        }
    }

    // Método para mostrar el historial de ventas
    public void mostrarVentas() {
        System.out.println("Ventas realizadas:");
        if (ventas.isEmpty()) {
            System.out.println("No se han registrado ventas.");
        }
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }
}

