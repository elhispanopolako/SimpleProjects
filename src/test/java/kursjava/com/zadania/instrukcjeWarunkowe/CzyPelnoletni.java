package kursjava.com.zadania.instrukcjeWarunkowe;

import java.util.Scanner;

/*Napisz program, który pobiera wiek od użytkownika. Zapisz w zmiennej typu boolean informację, czy użytkownik jest
pełnoletni, czy nie. Skorzystaj z trój-argumentowego operatora warunkowego. Wypisz wynik zdefiniowanej zmiennej
typu boolean na ekran.*/
public class CzyPelnoletni {
    public static void main(String[] args) {
        System.out.println("Podaj swój wiek: ");
        int wiek=getInt();
        boolean czyPelnoletni=wiek>=18? true:false;
        System.out.println(czyPelnoletni);

    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
