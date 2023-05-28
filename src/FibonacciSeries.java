import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements, first=0,second=0, third=0;

        System.out.print("Elaman Sayısı : ");
        numberOfElements = input.nextInt();

        for (int i=1;i<=numberOfElements;i++){
            if (i==1){
                third = 0;
            }
            else if (i==2){
                third = 1;
            }else {
                first = second;
                second = third;
                third = first + second;
            }
            System.out.print(third+" ");
        }
    }
}
