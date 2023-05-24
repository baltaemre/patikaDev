import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row;

        System.out.print("Satır sayısını giriniz : ");
        row = input.nextInt();

        for (int i=1;i<=(2*row-1);i++){
            System.out.println("");
            if (i<=row){
                for (int j=1;j<=row-i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=(2*i-1);k++){
                    System.out.print("*");
                }

            }else {
                for (int r=1;r<=(i-row);r++){
                    System.out.print(" ");
                }
                for (int m=1;m<=(2*row-1)-2*(i-row);m++){
                    System.out.print("*");
                }
            }
        }

    }
}