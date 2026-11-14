package Taller7.Ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;

        System.out.println("Suma: " + Utilidades.sumar(num1, num2));
        System.out.println("Resta: " + Utilidades.restar(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(num1, num2));
        System.out.println("División: " + Utilidades.dividir(num1, num2));
        System.out.println("División por cero: " + Utilidades.dividir(num1, 0));
    }
}
