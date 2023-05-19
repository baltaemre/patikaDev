import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayiBir, sayiIki, sayiUc;

        System.out.print("Birinci sayiyi giriniz: ");
        sayiBir = giris.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        sayiIki = giris.nextInt();

        System.out.print("Ucuncu sayiyi giriniz: ");
        sayiUc = giris.nextInt();

        if (sayiBir > sayiIki && sayiBir > sayiUc){
            if (sayiIki > sayiUc){
                System.out.println("Birinci sayi > ikinci sayi > ucuncu sayi");
            }else{
                System.out.println("Birinci sayi > ucuncu sayi > ikinci sayi");
            }

        }else if(sayiIki > sayiBir && sayiIki > sayiUc){
            if (sayiBir > sayiUc){
                System.out.println("Ikinci sayi > birinci sayi > ucuncu sayi");
            }else{
                System.out.println("Ikinci sayi > ucuncu sayi >  ikinci sayi");
            }

        }else{
            if (sayiBir > sayiIki){
                System.out.println("Ucuncu sayi > birinci sayi > ikinci sayi");
            }else{
                System.out.println("Ucuncu sayi > ikinci sayi > birinci sayi");
            }

        }
    }
}