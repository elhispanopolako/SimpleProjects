package kursjava.com.zadania.petle;
//https://kursjava.com/petle/zadanie-do-petli/
//Napisz program z użyciem pętli while, który wypisuje wszystkie liczby od 1 do 10 (włącznie),
// oddzielone przecinkami, poza liczbą 10, po której nie powinno być przecinka.
public class WhileILiczby {
    public static void main(String[] args) {

        int x=1;
        while(x<=10){
            if( x!=10){
                System.out.println(x++ + ",");
            }else{
                System.out.println(x++);
            }

        }

    }
}
