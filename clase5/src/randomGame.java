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
        var hiddenNum = (Math.random() * 100)+1;
        System.out.println(hiddenNum);
        while (true) {
            if (userData == hiddenNum){
                System.out.println("Felicidades has adivinado el numero!"+hiddenNum);
                break;
            }else if ((hiddenNum >= 1 ) || (hiddenNum <= 30)) {
                Scanner data1 = new Scanner(System.in);
                System.out.println("Estas cerca, haz otro intento!");
                userData = Integer.parseInt(data1.nextLine());
            }else if (hiddenNum >= 31 || userData <= 60) {
                Scanner data1 = new Scanner(System.in);
                System.out.println("Sigues cerca, intenta de nuevo!");
                userData = Integer.parseInt(data1.nextLine());
            }else if (userData >= 61 && userData <= 90) {
                Scanner data1 = new Scanner(System.in);
                System.out.println("Cerca, intenta de nuevo!");
                userData = Integer.parseInt(data1.nextLine());
            }
            else if (userData > 100 || userData <= 0) {
                System.out.println("Increible! No sigues instrucciones! :/");
                break;
            }else {
                Scanner data1 = new Scanner(System.in);
                System.out.println("Sigue intentando!");
                userData = Integer.parseInt(data1.nextLine());
            }
        }
    }
}
