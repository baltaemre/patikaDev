import java.util.Scanner;

public class daireninAlanveCevreHesabi {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double yariCap, merkazAcı, cevre, alan;
        double pi = 3.14;

        System.out.print("Yari Cap değerini giriniz = ");
        yariCap = giris.nextDouble();

        System.out.print("Merkez Acı değerini giriniz = ");
        merkazAcı = giris.nextDouble();

        cevre = 2 * pi * yariCap * (merkazAcı/360);
        alan = pi * yariCap * yariCap * (merkazAcı/360);

        System.out.println("Dairenin Cevresi = "+cevre);
        System.out.println("Dairenin Alani = "+alan);


    }
}