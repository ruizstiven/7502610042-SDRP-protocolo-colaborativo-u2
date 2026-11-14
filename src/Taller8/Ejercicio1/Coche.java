package Taller8.Ejercicio1;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarInfoCoche() {
        mostrarInfoVehiculo();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
