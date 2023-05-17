import java.util.Scanner;

public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {

        double paraDegeri, kdvsizFiyat, kdvliFiyat, kdvTutari;

        Scanner input = new Scanner(System.in);

        System.out.print("tutari giriniz: ");
        paraDegeri = input.nextDouble();

        kdvTutari = (paraDegeri <= 1000) ? (paraDegeri*18/100) : (paraDegeri*8/100);

        kdvsizFiyat = paraDegeri;
        kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat = "+kdvsizFiyat);
        System.out.println("KDV'li Fiyat = "+kdvliFiyat);
        System.out.println("KDV tutarı = "+kdvTutari);

    }
}