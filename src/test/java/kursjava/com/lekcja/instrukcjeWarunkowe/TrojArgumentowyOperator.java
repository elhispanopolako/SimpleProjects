package kursjava.com.lekcja.instrukcjeWarunkowe;

public class TrojArgumentowyOperator {
    public static void main(String[] args) {
        int x = -5;
        int wartoscAbsolutna;
        wartoscAbsolutna = x >= 0 ? x : -x;
        System.out.println(
                "Wartosc absolutna liczby " + x + " wynosi " + wartoscAbsolutna
        );
    }
}
