/*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/
import java.util.Scanner;
public class tipsCalc {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Hola, puedes ingresar el total de la cuenta de todo lo que consumiste en el restaurante?");
        double invoice = Double.parseDouble(data.nextLine());
        System.out.println("Ingresa el porcentaje de la propina que deseas dejar");
        double tip = Double.parseDouble(data.nextLine());
        var total = invoice - (invoice*tip/100);
        System.out.println(total);
    }
}
