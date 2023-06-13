/*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
import java.util.Scanner;
public class randomGame {
    public static void main(String[] args) {
        var hiddenNum = (int)(Math.random() * 50)+1;
        Scanner data = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 a 100");
        int userData = Integer.parseInt(data.nextLine());
        while (true) {
            if (userData == hiddenNum) {
                System.out.println("Felicidades has adivinado el numero! " + hiddenNum);
                break;
            } else if (userData <= 0 || userData > 100) {
                System.out.println("Esto es increible!!!, no sigues instrucciones!!! :/");
                break;
            }else{
                System.out.println("Sigue intentando!");
                userData = Integer.parseInt(data.nextLine());
            }
        }
    }
}