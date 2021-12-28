import java.util.Scanner;

public class Logowanie {
    public static void main(String[] args) {
        System.out.println("Podaj Login:");
        Scanner scanner=new Scanner(System.in);
        String login= scanner.nextLine();
        System.out.println("Podaj hasło:");
        String haslo= scanner.nextLine();
        if((login.equals("admin"))&&(haslo.equals("test123"))){
            System.out.println("Udało się zalogować");
        }else{
            System.out.println("Nie udało się zalogować");
        }
    }
}
