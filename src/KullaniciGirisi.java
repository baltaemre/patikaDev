import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        String kullaniciAdi, sifre, cevap, yeniSifre;

        System.out.print("Kullanici Adinizi Giriniz: ");
        kullaniciAdi = giris.nextLine();

        System.out.print("Sifrenizi Giriniz: ");
        sifre = giris.nextLine();

        if(kullaniciAdi.equals("patika")){
            if (sifre.equals("java123")){
                System.out.println("Basarili Giris Yaptiniz");
            }else {
                System.out.println("Sifrenizi Sifirlamak Istermisiniz? ");
                System.out.println("Evet için E veya e giriniz");
                System.out.println("Hayir için H veya h giriniz");
                System.out.print("Cevabiniz : ");
                cevap = giris.nextLine();
                if (cevap.equals("E") || cevap.equals("e")){
                    System.out.print("Yeni Sifreyi Giriniz : ");
                    yeniSifre = giris.nextLine();
                    if(yeniSifre.equals("java123")){
                        System.out.println("Sifre Olusturulamadi");
                    }else{
                        System.out.println("Sifre Olusturuldu");
                    }
                }else {
                    System.out.println("Mevcut Kullanici Adi ve Sifrenizi Tekrar Giriniz");
                }
            }
        }else {
            System.out.println("Yanlıs Kullanıcı Adi Girdiniz!!");
        }
    }
}