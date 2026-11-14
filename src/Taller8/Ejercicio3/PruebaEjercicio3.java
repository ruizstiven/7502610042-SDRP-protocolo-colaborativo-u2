package Taller8.Ejercicio3;

public class PruebaEjercicio3 {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Luis Pérez", 2500000);
        Gerente ger = new Gerente("María López", 5500000, "Tecnología");

        System.out.println("--- Empleado ---");
        emp.mostrarDetalles();

        System.out.println("\n--- Gerente ---");
        ger.mostrarDetalles();
    }
}