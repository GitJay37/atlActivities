/*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
import java.util.Scanner;
public class randomGame {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 a 100");
        int userData = Integer.parseInt(data.nextLine());
        var hiddenNum = 37;
        while (userData <= hiddenNum && userData >= hiddenNum) {
            if (userData == hiddenNum){
                System.out.println("Felicidades has adivinado el numero!"+hiddenNum);
                break;
            } else if (userData > 30 && userData < 40) {
                System.out.println("Estas cerca de adivinar, sigue intentando");
            }else if ((userData > 33) && (userData < -39)) {
                System.out.println("Estas cerca, sigue intentando");
            }else if((userData < -0) || (userData > 100)){
                System.out.println("Estas fuera del rango indicado :/");
            }else System.out.println("Sigue intentando!");
            userData++;
        }
    }
}
