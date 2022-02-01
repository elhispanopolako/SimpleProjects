package kursjava.com.zadania.instrukcjeWarunkowe;

import java.util.Scanner;

/*Napisz program, który pobierze od użytkownika dwie liczby i wypisze największą z nich.*/
public class Najwieksza {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby:");
        int x,y;
        x=getInt();
        y=getInt();
        boolean czyWieksza=x>y;
        if (czyWieksza){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
