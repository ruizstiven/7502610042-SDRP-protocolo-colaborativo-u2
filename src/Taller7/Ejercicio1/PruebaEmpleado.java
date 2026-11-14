package Taller7.Ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos Pérez", 2500000);

        // Acceso directo al atributo público
        System.out.println("Nombre inicial: " + emp.nombre);
        emp.nombre = "Carlos Andrés Pérez";
        System.out.println("Nombre actualizado: " + emp.nombre);

        // Acceso controlado mediante get y set
        System.out.println("Salario actual: $" + emp.getSalario());
        emp.setSalario(-500000); // Intento inválido
        emp.setSalario(3000000); // Actualización válida
        System.out.println("Nuevo salario: $" + emp.getSalario());
    }
}
