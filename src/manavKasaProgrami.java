import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplamTutar;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5.0;

        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = giris.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = giris.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = giris.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = giris.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKilo = giris.nextDouble();

        toplamTutar = (armutKilo*armutFiyat)+(elmaKilo*elmaFiyat)+(domatesKilo*domatesFiyat)+(muzKilo*muzFiyat)+(patlicanKilo*patlicanFiyat);

        System.out.println("Toplam Tutar : "+toplamTutar);
        
    }
}