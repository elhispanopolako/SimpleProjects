import java.util.Scanner;

public class NameLoop {
    public static void main(String[] args) {
        System.out.println("Podaj imie:");
        Scanner scanner=new Scanner(System.in);
        String imie= scanner.nextLine();
        System.out.println("Podaj liczbę całkowitą:");
        int liczba= scanner.nextInt();
        for(int i=1;i<liczba;i++){
            System.out.println(i+"."+imie);
        }

    }
}
