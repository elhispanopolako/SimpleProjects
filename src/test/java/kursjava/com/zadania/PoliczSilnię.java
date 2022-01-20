package kursjava.com.zadania;

import java.util.Scanner;

public class PoliczSilnię {
    //Napisz program, który policzy i wypisze silnię liczby, którą poda użytkownik.
    // Silnia to iloczyn kolejnych liczb całkowitych od 1 do danej liczby, np. silnia 5 to 1 * 2 * 3 * 4 * 5,
    // czyli 120. Silnia liczby 0 to 1.
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, policzymy silnię");
        Scanner scanner=new Scanner(System.in);
        int liczba=scanner.nextInt();

        if(liczba<0){
            System.out.println("Podaj liczbę dodatnią");
        }else{
            int silnia=1;
            for(int i=1;i<=liczba;i++){
                silnia= silnia * i;
            }
            System.out.println("Silnia to "+silnia);
        }
    }
}
