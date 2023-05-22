import java.util.Scanner;

/* tek bir sayı girilene kadar kullanıcıdan girişleri kabul et
 * girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana bas
 */

public class ProgramThatTakesInputFromTheUserUntilASingleNumberIsEntered {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, index, sum=0;
        boolean isEvenNumber = true;

        do {
            System.out.print("Sayıyı giriniz : ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0){
                sum += number;
                isEvenNumber = true;
            }else if (number % 2 ==1){
                isEvenNumber = false;
                System.out.println("Tek sayı girdiniz !");
            }

        }while (isEvenNumber);
        System.out.println("2 ve 4 tam bölünen sayıların toplamı = "+sum);
    }
}

