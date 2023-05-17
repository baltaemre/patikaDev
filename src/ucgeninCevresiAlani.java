import java.util.Scanner;

public class ucgeninCevresiAlani {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double birinciKenar, ikinciKenar, ucuncuKenar, u, cevre, alan;

        System.out.print("Birinci kenari giriniz: ");
        birinciKenar = giris.nextDouble();

        System.out.print("İkinci kenari giriniz: ");
        ikinciKenar = giris.nextDouble();

        System.out.print("Ucuncu kenari giriniz: ");
        ucuncuKenar = giris.nextDouble();

        u = (birinciKenar + ikinciKenar + ucuncuKenar)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u - birinciKenar)*(u - ikinciKenar)*(u - ucuncuKenar));

        System.out.println("Ucgenin Cevresi = "+cevre);
        System.out.println("Ucgenin Alani = "+alan);



    }
}