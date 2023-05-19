import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    /*    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sicaklik;

        System.out.print("Sicaklik Degerini Giriniz: ");
        sicaklik = giris.nextInt();

        if (sicaklik < 5){
            System.out.println("Kayak yapmaya gidebilirsiniz");
        } else if(sicaklik >= 5 && sicaklik <= 15){
            System.out.println("Sinemaya gidebilirsiniz");
        }else if(sicaklik > 15 && sicaklik <= 25){
            System.out.println("Piknik yapmaya gidebilirsiniz");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }



    }
}