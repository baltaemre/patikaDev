import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int matematik, fizik, turkce, kimya, muzik, indeks =0, toplam = 0;
        double ortalama;

        System.out.print("Matematik Notunu Giriniz: ");
        matematik = giris.nextInt();
        if (matematik >=0 && matematik <=100){
            toplam += matematik;
            ++indeks;
        }

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = giris.nextInt();
        if (fizik >=0 && fizik <=100){
            toplam += fizik;
            indeks++;
        }

        System.out.print("Turkce Notunu Giriniz: ");
        turkce = giris.nextInt();
        if (turkce >=0 && turkce <=100){
            toplam += turkce;
            indeks++;
        }

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = giris.nextInt();
        if (kimya >=0 && kimya <=100){
            toplam += kimya;
            indeks++;
        }

        System.out.print("Muzik Notunu Giriniz: ");
        muzik = giris.nextInt();
        if (muzik >=0 && muzik <=100){
            toplam += muzik;
            indeks++;
        }

        if (indeks != 0){
            ortalama = toplam / indeks;
            if (ortalama >= 55){
                System.out.println("Ortalamanız = "+ortalama+" Tebrikler Sinifi Gectiniz...");
            }else {
                System.out.println("Ortalamanız = "+ortalama+" Maalesef Sinifta Kaldiniz!!");
            }
        }else {
            System.out.println("Yanlıs Girdiniz!!");
        }
    }
}