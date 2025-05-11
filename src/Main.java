public class Main {
    public static void main(String[] args) {
        // Crear un concesionario
        Concesionario concesionario = new Concesionario();

        // Agregar vehículos al inventario (usando subclases especializadas)
        concesionario.agregarVehiculo(new Auto("001", "Toyota", 2020, 0));
        concesionario.agregarVehiculo(new Camioneta("002", "Chevrolet", 2018, 50000));
        concesionario.agregarVehiculo(new Motocicleta("003", "Suzuki", 2019, 10000));

        // Mostrar el inventario
        concesionario.mostrarInventario();

        // Realizar una venta
        concesionario.realizarVenta("002", 25000, "Pérez", "Juan", "12345678");

        // Mostrar el inventario y las ventas
        concesionario.mostrarInventario();
        concesionario.mostrarVentas();
    }
}

