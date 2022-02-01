package kursjava.com.zadania;

import java.util.Scanner;
/*Napisz program, który pobierze od użytkownika jedną liczbę całkowitą. Następnie, program powinien wypisać
na ekran choinkę ze znaków *, gdzie w ostatniej linii będzie liczba gwiazdek podana przez użytkownika, a w każdej
powyższej o dwie gwiazdki mniej, niż w poniższej.*/
public class Choinka {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę zrobimy choinkę");
        int liczbawpodstawie=getInt();
        int liczbanaszczycie=liczbawpodstawie%2==0 ? 2:1;
        for(int gwiazdkiWRzedzie=liczbanaszczycie;
        gwiazdkiWRzedzie<=liczbawpodstawie;
        gwiazdkiWRzedzie+=2){
            int liczbaspacji=(liczbawpodstawie-gwiazdkiWRzedzie)/2;
            for(int i=0;i<liczbaspacji+gwiazdkiWRzedzie;i++){
                System.out.print(i<liczbaspacji ? " ": "*");
            }
            System.out.println();
        }


    }
    public static Integer getInt(){
        return new Scanner(System.in).nextInt();
    }
}
