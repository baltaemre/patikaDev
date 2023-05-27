import java.util.Scanner;

public class FindingTheBiggestAndSmallestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int enteredNumber, number, max=0, min=0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        enteredNumber = input.nextInt();

        for (int i=1;i<=enteredNumber;i++){
            System.out.print(i+". sayıyı giriniz : ");
            number = input.nextInt();
            if (i == 1){
                max = number;
                min = number;
            }
            if (number > max){
                max = number;
            }else if (number < min){
                min = number;
            }
        }
        System.out.println("En büyük sayı : "+max);
        System.out.println("En küçük sayı : "+min);
    }
}