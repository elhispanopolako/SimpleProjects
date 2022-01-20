package kursjava.com.zadania;
//Napisz program, który z liczb podanych przez użytkownika wypisze największą.
// Program po pobraniu każdej liczby powinien pytać, czy użytkownik chce podać kolejną liczbę.
// Po podaniu liczb, program powinien wypisać największą z nich.

import java.util.List;
import java.util.Scanner;

public class WypiszNajwiekszaLiczbe {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        int liczba=getInt();
        while (true){
            System.out.println("Czy chcesz zakończyć program (t/n)");
            String czyKoniec=getString();
            if (czyKoniec.equals("t")){
                break;
            }
            System.out.print("Podaj kolejną liczbę:");
            int nowaliczba=getInt();
            if(nowaliczba>liczba){
                liczba=nowaliczba;
            }
            System.out.println("Największa liczba z podanych to: "+liczba);


        }


    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static String getString() {
        return new Scanner(System.in).next();
    }
}
