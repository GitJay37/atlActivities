/*
    2) Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.
*/
import  java.util.Scanner;
public class millasKilo {
    public static void main(String[] args) {
        Scanner millas = new Scanner(System.in);
        System.out.println("Hola, puedes por favor ingresar una distancia en millas?");
        double kilometers = Double.parseDouble(millas.nextLine());
        kilometers *= 1.609_34;
        System.out.println("Las millas que ingresaste, serian "+kilometers+" kilometros");
    }
}
