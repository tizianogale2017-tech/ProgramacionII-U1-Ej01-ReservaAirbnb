package Ejercicio1_reservaAirbnb;
public class ReservaAirbnb {
    private String nombreHuesped;
    private int noches;
    private double precioNoche;

public ReservaAirbnb(String nombreHuesped, int noches, double precioNoche) {
    if (noches <=0) {
        throw new IllegalArgumentException("El número de noches debe ser mayor a cero.");
    }
    if (precioNoche <=0) {
        throw new IllegalArgumentException("El precio por noche debe ser mayor a cero.");
    }
    this.nombreHuesped = nombreHuesped;
    this.noches = noches;
    this.precioNoche = precioNoche;
        }
        public double calcularTotal() {
            
            return noches * precioNoche;
        }
        public void mostrarDetalle() {
            
            System.out.println("Nombre del huésped: " + nombreHuesped);
            System.out.println("Número de noches: " + noches);
            System.out.println("Precio por noche: $" + precioNoche);
            System.out.println("Total a pagar: $" + calcularTotal());
        }
}



