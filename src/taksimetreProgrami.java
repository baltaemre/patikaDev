import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        double mesafe, toplamUcret, yolTutari;
        float kmBasına = 2.2f;
        byte acılısUcreti = 10, minumumTutar = 20;

        System.out.print("Mesafeyi giriniz: ");
        mesafe = giris.nextDouble();

        yolTutari = kmBasına * mesafe + acılısUcreti;
        toplamUcret = (yolTutari>=minumumTutar) ? (yolTutari) : (minumumTutar);

        System.out.println("Toplam Ucret = "+toplamUcret);

    }
}