package kursjava.com.zadania;

import java.util.Scanner;



    public  class Kalkulator {
        public static void main(String[] args) {
            System.out.print("Podaj liczbe: ");
            int poprzedniWynik = getInt();
            String czyKoniec;
            boolean czyBlednaOperacja;
            do {
                int nowyWynik = 0;
                czyBlednaOperacja = false;
                System.out.print("Podaj dzialanie (* / - +): ");
                String dzialanie = getString();
                System.out.print("Podaj kolejna liczbe: ");
                int drugaLiczba = getInt();
                switch (dzialanie) {
                    case "+":
                        nowyWynik = poprzedniWynik + drugaLiczba;
                        break;
                    case "-":
                        nowyWynik = poprzedniWynik - drugaLiczba;
                        break;
                    case "*":
                        nowyWynik = poprzedniWynik * drugaLiczba;
                        break;
                    case "/":
                        if (drugaLiczba == 0) {
                            czyBlednaOperacja = true;
                            System.out.println("Nie moge podzielic przez 0.");
                        } else {
                            nowyWynik = poprzedniWynik / drugaLiczba;
                        }
                        break;
                    default:
                        czyBlednaOperacja = true;
                        System.out.println("Nieprawidlowa operacja.");
                }
                if (!czyBlednaOperacja) {
                    System.out.println(
                            poprzedniWynik + " " + dzialanie + " " + drugaLiczba + " = " + nowyWynik
                    );
                    poprzedniWynik = nowyWynik;
                }
                System.out.println("Czy chcesz zakonczyc program? [t/n]");
                czyKoniec = getString();
            } while (!czyKoniec.equals("t"));
        }
        public static int getInt() {
            return new Scanner(System.in).nextInt();
        }
        public static String getString() {
            return new Scanner(System.in).next();
        }
    }
