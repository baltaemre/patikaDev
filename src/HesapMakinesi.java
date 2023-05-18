import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        double sayiBir, sayiIki;
        String oparator;

        System.out.print("Işlem oparatorunu giriniz: ");
        oparator = giris.nextLine();

        System.out.print("Birinci sayiyi giriniz: ");
        sayiBir = giris.nextDouble();

        System.out.print("Ikinci sayiyi giriniz: ");
        sayiIki = giris.nextDouble();

        switch (oparator){
            case "+":
                System.out.println(""+sayiBir+" + "+sayiIki+" = "+(sayiBir+sayiIki));
                break;
            case "-":
                System.out.println(""+sayiBir+" - "+sayiIki+" = "+(sayiBir-sayiIki));
                break;
            case "*":
                System.out.println(""+sayiBir+" * "+sayiIki+" = "+(sayiBir*sayiIki));
                break;
            case "/":
                if(sayiIki == 0){
                    System.out.println("Sifira bolum yanlıstır");
                }else {
                    System.out.println(""+sayiBir+" / "+sayiIki+" = "+(sayiBir/sayiIki));
                }
                break;
            default:
                System.out.println(" Yanlıs oparator sectiniz!!");
        }
    }
}