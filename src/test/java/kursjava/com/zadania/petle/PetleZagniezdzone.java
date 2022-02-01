package kursjava.com.zadania.petle;
/*Napisz program z dwoma pętlami (jedna zagnieżdżona w drugiej), każda z pętli powinna iterować od 1 do 10.

   Pętla główna powinna pomijać swoje iteracje za pomocą instrukcji continue, gdy jej zmienna jest nieparzysta.
   Pętla zagnieżdżona powinna wypisywać wartość swojej zmiennej. Następnie, gdy zmienna pętli zagnieżdżonej jest
   większa od zmiennej pętli głównej, pętla zagnieżdżona powinna spowodować, że przejdziemy do kolejnej iteracji pętli
   głównej (w tym przypadku skorzystaj z etykiety i instrukcji continue).
    */
public class PetleZagniezdzone {
    public static void main(String[] args) {
       glowna_petla:
        for(int i=0;i<=10;i++){
           if(i%2==1){
               continue;
            }
            for (int j=0;j<=10;j++){
                System.out.print(j);
                if (j>i){
                    continue glowna_petla;
                }

            }

        }

    }


}
