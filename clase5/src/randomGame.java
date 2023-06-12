/*
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/

import java.util.Scanner;
public class randomGame {
    public static void main(String[] args) {
        var hiddenNum = 51;//(int)(Math.random() * 50)+1;
        //System.out.println(hiddenNum);
        Scanner data = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 a 100");
        int userData = Integer.parseInt(data.nextLine());
        while (true) {
            if (userData == hiddenNum){
                System.out.println("Felicidades has adivinado el numero"+hiddenNum);
                break;
            }else if (userData <=0 || userData > 100) {
                System.out.println("Esto es increible!!!, no sigues instrucciones!!! :/");
                break;
            }
            if (userData >= 1 && userData <= 33) {

                if (userData == hiddenNum) {
                    System.out.println("Felicidades has adivinado el numero" + hiddenNum);
                    break;
                } else if (userData >= 1 && userData <= 17) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Muy cerca!, sigue intentando");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData >= 18 && userData <= 33) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Muy cerca!, sigue intentando");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData <= 50) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Estas cerca!, intenta de nuevo!");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData >= 51 && userData <= 100) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Pista!, estás lejos!, intenat de nuevo!");
                    userData = Integer.parseInt(data2.nextLine());
                }
            }

            else if (userData >= 34 && userData <= 66) {

                if (userData == hiddenNum) {
                    System.out.println("Felicidades has adivinado el numero" + hiddenNum);
                    break;
                } else if (userData >= 34 && userData <= 50) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Muy cerca!, sigue intentando");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData >= 51 && userData <= 66) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Muy cerca!, sigue intentando");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData >= 52 && userData <= 70) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Estas cerca!, intenta de nuevo!");
                    userData = Integer.parseInt(data2.nextLine());
                } else if (userData <= 34 && userData >= 67 && userData <= 100) {
                    Scanner data2 = new Scanner(System.in);
                    System.out.println("Pista!, estás lejos!, intenat de nuevo!");
                    userData = Integer.parseInt(data2.nextLine());
                }
            }
        }
    }
}