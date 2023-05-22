import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

public class PowersOf4and5UpToTheNumberEntered {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, index=0;
        double powerOfFour,  powerOfFive;
        boolean station = true;

        System.out.print("Limit değerini giriniz : ");
        number = input.nextInt();

        if (number > 0){
            while (station){
                powerOfFour = Math.pow(4,index);
                powerOfFive = Math.pow(5,index);
                station = false;

                if (powerOfFour <= number){
                    System.out.println("4'ün "+index+". kuvveti = "+powerOfFour);
                    station = true;
                }
                if(powerOfFive <= number){
                    System.out.println("5'in "+index+". kuvveti = "+powerOfFive);
                    station = true;
                }
                index++;
            }
        }else {
            System.out.println("Hatali sayi girdiniz !!");
        }




    }
}