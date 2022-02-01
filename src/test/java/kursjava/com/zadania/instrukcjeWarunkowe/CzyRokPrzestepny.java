package kursjava.com.zadania.instrukcjeWarunkowe;

import java.util.Scanner;

/*Napisz program, który pobierze od użytkownika rok i odpowie na pytanie, czy podany rok jest rokiem przestępnym,
czy nie.*/
public class CzyRokPrzestepny {
    public static void main(String[] args) {
        System.out.println("Podaj dowolny rok: ");
        int rok=getInt();
       boolean czyPrezstepny= (rok%4==0 && rok%100!=0) || rok%400==0;
       if (czyPrezstepny){
           System.out.println("Rok "+rok+" jest rokiem przestępnym");
       }else{
           System.out.println("Rok "+rok+" nie jest rokiem przestępnym");
       }

    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
