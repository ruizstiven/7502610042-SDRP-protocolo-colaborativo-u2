package Taller8.Ejercicio1;

public class PruebaEjercicio1 {
    public static void main(String[] args) {
        Vehiculo moto = new Vehiculo("Yamaha", 180);
        System.out.println("--- Vehículo ---");
        moto.mostrarInfoVehiculo();

        Coche miCoche = new Coche("Toyota", 220, 4);
        System.out.println("\n--- Coche ---");
        miCoche.mostrarInfoCoche();
    }
}