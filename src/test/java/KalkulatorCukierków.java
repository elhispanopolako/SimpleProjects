import java.util.Scanner;

public class KalkulatorCukierków {


    public static void main(String[] args){
        int cukierki,x,y,uczniowie;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile uczniów jest w twojej klasie:");
        uczniowie=scanner.nextInt();
        System.out.println("Ile cukierkow kupila mama:");
        cukierki= scanner.nextInt();
        x=cukierki/(uczniowie-1);
        System.out.println("Cukierkow dla kazdego ucznia: "+x);
        y=cukierki-x*(uczniowie-1);
        System.out.println("Dla Jasia na wieczor: "+y );

    }

}
