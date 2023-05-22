import java.util.Scanner;

// C(n,r) = n! / (r! * (n-r)!)

public class CombinationCalculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,r;
        int combination, nFactorial=1, rFactorial=1, nrFactorial=1;

        System.out.println("N’in r’li kombinasyonu genel gösterimi C(n,r) ");

        System.out.print("Birinci sayıyı giriniz : ");
        n = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        r = input.nextInt();

        for(int i = 1;i <= n; i++)
            nFactorial *= i;

        for (int j =1;j <= r;j++)
            rFactorial *= j;

        for (int k = 1;k <= (n-r);k++)
            nrFactorial *= k;

        combination = nFactorial / (rFactorial * nrFactorial);

        System.out.println("C("+n+","+r+") = "+combination);
        
    }
}