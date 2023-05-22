import java.util.Scanner;

public class ExponentCalculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int baseNumber, exponentialNumber, total=1;

        System.out.print(" Üssü alınacak sayıyı giriniz : ");
        baseNumber = input.nextInt();

        System.out.print(" Üs olacak sayıyı giriniz : ");
        exponentialNumber = input.nextInt();

        for (int i = 1; i <= exponentialNumber; i++){
            total *= baseNumber;
        }

        System.out.println(baseNumber+"'ın "+exponentialNumber+". üssü = "+total);

    }
}
