import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        double vucutKitleIndeksi, boy, kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = giris.nextDouble();

        System.out.print("KLütfen kilonuzu giriniz: ");
        kilo = giris.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vucutKitleIndeksi);




    }
}