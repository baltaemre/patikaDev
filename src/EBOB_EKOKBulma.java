import java.util.Scanner;

public class EBOB_EKOKBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne, numberTwo, EBOB=1, EKOK=1, max, min;

        System.out.print("İlk sayıyı giriniz : ");
        numberOne = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        numberTwo = input.nextInt();

        if (numberOne > numberTwo){
            max = numberOne;
            min = numberTwo;
        }else {
            max = numberTwo;
            min = numberOne;
        }

        int i= max;
        while (i >= 1){
            if(numberOne % i == 0 && numberTwo % i == 0){
                EBOB = i;
                break;
            }
            i--;
        }

        i = numberOne * numberTwo;
        while (i >= 1){
            if (i % numberOne == 0 && i % numberTwo == 0) {
                EKOK = i;
            }
            i--;
        }
        System.out.print(min+" ve "+max+" sayılarının\n"+"EBOB değeri : "+EBOB+"\nEKOK değeri : "+EKOK);
    }
}