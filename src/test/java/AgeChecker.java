import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();
        if (age <= 0) {
            System.out.println("Jeszcze Cie nie ma na świecie");
        }
        else if (age < 18) {
            System.out.println("Jesteś niepełnoletni");
        }
        else {
            System.out.println("Jesteś pełnoletni");
        }
    }
}
