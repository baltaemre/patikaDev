import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        double sum=0.0;

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        for (int i=1;i<=number;i++){
            sum += 1.0/i;
        }
        System.out.println(number+"'nin harmonik ortalaması = "+sum);
    }
}