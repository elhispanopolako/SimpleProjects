package kursjava.com.zadania.instrukcjeWarunkowe;

import java.util.Scanner;

/*Napisz program, który wczyta od użytkownika trzy liczby i odpowie na pytanie, czy można z nich zbudować trójkąt
(suma każdych dwóch boków powinna być większa od trzeciego boku).*/
public class CzyMoznaZbudowacTrojkat {
    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby: ");
        int pierwsza=getInt();
        int druga=getInt();
        int trzecia=getInt();
        boolean czyTrojkat=pierwsza+druga>trzecia&&trzecia+druga>pierwsza&&pierwsza+trzecia>druga;
        if (czyTrojkat){
            System.out.println("Można zbudować trójkąt");
        }else{
            System.out.println("Nie można zbudować trójkąt");
        }
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
