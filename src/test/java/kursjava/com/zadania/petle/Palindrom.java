package kursjava.com.zadania.petle;

import java.util.Scanner;

//Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest palindromem.
// Palindrom to słowo, które jest takie samo czytane od początku i od końca, np. kajak.
public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Podaj słowo sprawdzimy czy jest palindromem");
        String slowo=getString();
        boolean czyPalindrom=true;
        int dlugosc=slowo.length();
        for (int i=0;i< dlugosc/2;i++) {
            if (slowo.charAt(i) != slowo.charAt(dlugosc - 1 - i)) {
                czyPalindrom = false;
                break;
            }
        }
        if (czyPalindrom){
            System.out.println("Słowo "+slowo+ " jest palindromem");
        }else{
            System.out.println("Słowo "+slowo+" nie jest palindromem");
        }



    }
        public static String getString() {
            return new Scanner(System.in).next();
    }
}
