import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, numberTwo, sum=0;

        System.out.print("Sayiyi giriniz : ");
        number = input.nextInt();
        numberTwo = number;

        while (number>0){
                sum += (number % 10);
                number /= 10;
        }
        System.out.println(numberTwo+" sayısının rakamları toplamı = "+sum);
    }
}