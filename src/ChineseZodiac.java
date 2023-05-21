import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int birthyear, index;
        String horoscope = "";

        System.out.print("Enter Your Birth Year : ");
        birthyear = input.nextInt();
        index = birthyear %12; // the remainder of the year of birth according to mod 12

        switch (index){
            case 0:
                horoscope = "Monkey";
                break;
            case 1:
                horoscope = "Rooster";
                break;
            case 2:
                horoscope = "Dog";
                break;
            case 3:
                horoscope = "Pig";
                break;
            case 4:
                horoscope = "Rat";
                break;
            case 5:
                horoscope = "Ox";
                break;
            case 6:
                horoscope = "Tiger";
                break;
            case 7:
                horoscope = "Rabbit";
                break;
            case 8:
                horoscope = "Dragon";
                break;
            case 9:
                horoscope = "Snake";
                break;
            case 10:
                horoscope = "Horse";
                break;
            case 11:
                horoscope = "Sheep";
                break;
        }
        System.out.println("Your Chinese Zodiac Sign : "+horoscope);
    }
}