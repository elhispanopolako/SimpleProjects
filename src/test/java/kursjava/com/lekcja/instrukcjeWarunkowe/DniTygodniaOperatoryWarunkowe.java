package kursjava.com.lekcja.instrukcjeWarunkowe;

import java.util.Scanner;

public class DniTygodniaOperatoryWarunkowe {
    public static void main(String[] args) {
        System.out.println("Podaj dzień tygodnia");
        int dzienTygodnia=getInt();

        if (dzienTygodnia<1||dzienTygodnia>7){
            System.out.println("Nieprawidłowy dzień tygodnia");
        } else if (dzienTygodnia==5){
            System.out.println("Jutro Weekend");
        } else if (dzienTygodnia == 6||dzienTygodnia==7) {
            System.out.println("Praca!");
        }else {
            System.out.println("Weekend");
        }
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
