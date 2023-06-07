/*
    3) Calculadora de descuento:
    Pídele al usuario que ingrese el precio original de un producto.
    Pídele al usuario que ingrese el porcentaje de descuento.
    Calcula el precio final después de aplicar el descuento utilizando la fórmula:
    precioFinal = precioOriginal - (precioOriginal * descuento / 100).
    Muestra el precio final al usuario.
*/
import java.util.Scanner;
public class discountCalc {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Hola, puedes ingresar el precio original del producto?");
        double price = Double.parseDouble(data.nextLine());
        System.out.println("Ingresa el porcentaje de descuento que se aplicará al producto");
        double discount = Double.parseDouble(data.nextLine());
        var finalDiscount = price - (price*discount/100);
        System.out.println(finalDiscount);
    }
}
