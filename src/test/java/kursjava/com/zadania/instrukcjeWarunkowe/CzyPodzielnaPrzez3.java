package kursjava.com.zadania.instrukcjeWarunkowe;

import java.util.Scanner;

/*Napisz program, który wczyta od użytkownika liczbę i wypisze, czy jest podzielna bez reszty przez 3.
Skorzystaj z operatora reszty z dzielenia – jeżeli reszta z dzielenia jest równa 0,to liczba jest podzielna przez 3.*/
public class CzyPodzielnaPrzez3 {
    public static void main(String[] args) {
        System.out.println("Podaj Liczbe:");
        int liczba=getInt();
        boolean czyPodzielna=liczba%3==0;
        if (czyPodzielna){
            System.out.println(liczba +" jest podzielna przez 3");
        }else {
            System.out.println(liczba +" nie jest podzielna przez 3");
        }
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
