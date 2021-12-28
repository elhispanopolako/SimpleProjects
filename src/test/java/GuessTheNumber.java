import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Witaj! Pomyslalem sobie liczbe od 1..100.");
        int liczba=  (int)(Math.random() * 101);
        int ile_prob=0;
        int strzal = 0;
        Scanner scanner=new Scanner(System.in);
        while(strzal != liczba){
            ile_prob++;
            System.out.println("Zgadnij jaka: (To twoja "+ile_prob+" próba):");
            strzal= scanner.nextInt();
            if(strzal==liczba){
                System.out.println("Udało się wygrywasz");
            }else if(strzal<liczba){
                System.out.println("To za malo");
            }else if(strzal>liczba){
                System.out.println("To za duzo");
            }
        }
    }
}
