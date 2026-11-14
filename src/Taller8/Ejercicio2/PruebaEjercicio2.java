package Taller8.Ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        Persona per = new Persona("Ana Gómez", 20);
        Estudiante est = new Estudiante("Carlos Ruiz", 22, "20261002");

        System.out.println("--- Detalles Estudiante 1 ---");
        per.mostrarDetalles();

        System.out.println("\n--- Detalles Estudiante 2 ---");
        est.mostrarDetalles();
    }
}