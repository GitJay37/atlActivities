/*
    1) Calculadora de edad de perros:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/

import java.util.Scanner;
public class dogCalc {
    public static void main(String[] args) {
        Scanner edadIngresada = new Scanner(System.in);
        System.out.println("Hola, hace cuantos años nació tu perro?");
        int edadPerro = Integer.parseInt(edadIngresada.nextLine());
        edadPerro = edadPerro * 7;
        System.out.println("Se dice que 1 año humano equivale a 7 años de perro, asi que tu perro tiene " + edadPerro + " años caninos");
    }
}
