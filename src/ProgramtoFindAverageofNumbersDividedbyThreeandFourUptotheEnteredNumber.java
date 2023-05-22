import java.util.Scanner;

public class ProgramtoFindAverageofNumbersDividedbyThreeandFourUptotheEnteredNumber {
    public static void main(String[] args) {
        int number, i=1, sum=0, index=0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        number = input.nextInt();

        while (i <= number){
            if (i % 3 == 0){
                if (i % 4 == 0){
                    sum += i;
                    index++; // how many numbers had been added to the sum
                }
            }
            i++;
        }
        if (index == 0){
            average = 0;
        }else {
            average = sum / index;
        }

        System.out.println(""+index+" tane sayi ortalamaya katildi");
        System.out.println("Ortalama deger = "+average);
    }
}