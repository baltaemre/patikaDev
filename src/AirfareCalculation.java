import java.util.Scanner;

public class AirfareCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int distance, age, tripType;
        double feePerDistance =0.1, price;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print(" Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tripType = input.nextInt();

        if ((distance>0) && (age > 0) && (tripType==1 || tripType==2)){
            price = distance * feePerDistance;
            if (age < 12){
                price *= 0.5;
            }else if (age >= 12 && age <=24){
                price *= 0.9;
            }else if (age > 65){
                price *= 0.7;
            }

            if (tripType == 2){
                price = (price * 0.8) * 2;
            }

            System.out.println("Toplam Tutar = "+price+" TL");
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}
