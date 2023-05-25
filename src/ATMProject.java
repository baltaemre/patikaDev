import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int remainingRight=3, select, price, balance = 1500;

        while (remainingRight > 0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenize giriniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para yatırmak\n"
                            + "2-Para Çekmek\n"
                            + "3-Bakiye Sorgulamak\n"
                            + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak isteğiniz işlemi seçiniz.");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance +=price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye yetersiz !");
                            }else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                    }
                }while (select !=4);
                System.out.println("Bizi tercihettiğiniz için teşekkür ederiz ");
                break;
            }else{
                remainingRight--;
                System.out.println( "Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if(remainingRight == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz !");

                }else{
                    System.out.println("Kalan Hakkınız : "+remainingRight);
                }
            }
        }
    }
}