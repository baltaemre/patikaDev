public class PrimeNumbers {
    public static void main(String[] args) {
        boolean primeNumber;

        for (int i=2;i<=100;i++){
            primeNumber = false;
            for (int j=2;j<=i/2;j++){
                if (i%j == 0){
                    primeNumber = true;
                }
            }
            if (primeNumber == false){
                System.out.print(i+" ");
            }
        }
    }
}