import java.util.Scanner;

public class WeryfikatorPin {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym banku!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PIN:");
        String PIN=scanner.nextLine();
        if (PIN.equals("1729")){
            System.out.println("Poprawny PIN");
        }else{
            System.out.println("PIN jest niepoprawny");
        }
    }


}
