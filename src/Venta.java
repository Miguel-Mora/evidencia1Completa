public class Venta {
    private static int contador = 1; // Generador simple de ID único
    private int idVenta; // ID único de la venta

    private double monto; // Monto de la venta
    private Vehiculo vehiculo; // Vehículo vendido
    private String apellido; // Apellido del comprador
    private String nombre; // Nombre del comprador
    private String documento; // Documento de identidad del comprador

    // Constructor de la clase Venta
    public Venta(double monto, Vehiculo vehiculo, String apellido, String nombre, String documento) {
        this.idVenta = contador++;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
    }

    // Método toString para representar la venta en texto
    @Override
    public String toString() {
        return "Venta #" + idVenta + ": " + vehiculo.toString() +
                " por $" + monto + " a " + nombre + " " + apellido +
                " (DNI: " + documento + ")";
    }

    // Getters si los necesitas
    public int getIdVenta() {
        return idVenta;
    }
}

