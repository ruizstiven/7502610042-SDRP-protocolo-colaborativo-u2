package Taller8.Ejercicio4.AtributosPrivados;

public class CuentaAhorros extends CuentaBancaria {
    public void imprimirSaldo() {
        // ERROR DE COMPILACIÓN: 'saldo' has private access in 'CuentaBancaria'
       // System.out.println("Saldo: " + saldo);
    }
}