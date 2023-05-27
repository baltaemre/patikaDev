import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row;

        System.out.print("Satır sayısını giriniz : ");
        row = input.nextInt();

        for (int i=row;i>=1;i--){
            System.out.println("");
            for (int k=1;k<=row-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        }
    }
}