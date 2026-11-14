package Taller7.Ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123-456789-0", 150000, "Ahorros");

        // Acceso válido a atributo público y métodos públicos
        cuenta.tipoCuenta = "Corriente";
        cuenta.setSaldo(200000);
        cuenta.mostrarDetalles();

        // El siguiente código genera un ERROR DE COMPILACIÓN si se descomenta:
        // System.out.println(cuenta.numeroCuenta);
        // Mensaje del compilador: "numeroCuenta has private access in CuentaBancaria"
    }
}
