import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        // 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        String durum;
        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik = giris.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = giris.nextInt();

        System.out.print("Turkce notunu giriniz: ");
        turkce = giris.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = giris.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = giris.nextInt();

        System.out.print("Muzik notunu giriniz: ");
        muzik = giris.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama deger = "+ortalama);

        durum = (ortalama>=60)? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(durum);

    }
}