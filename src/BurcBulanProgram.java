import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int ay, gun;
        String burc ="";

        System.out.print("Ayı rakam olarak giriniz: ");
        ay = giris.nextInt();

        System.out.print("Gunu rakam olarak giriniz: ");
        gun = giris.nextInt();
        if (ay >0 && ay <= 12){
            if (gun > 0 && gun <= 31){
                if (ay == 1){
                    if (gun <= 21){
                        burc = "Oglak";
                    }else{
                        burc = "kova";
                    }

                }else if(ay == 2){
                    if (gun <= 19){
                        burc = "Kova";
                    }else{
                        burc = "Balik";
                    }
                }else if(ay == 3){
                    if (gun <= 20){
                        burc = "Balik";
                    }else{
                        burc = "Koc";
                    }
                }else if(ay == 4){
                    if (gun <= 20){
                        burc = "Koc";
                    }else{
                        burc = "Boga";
                    }
                }else if(ay == 5){
                    if (gun <= 21){
                        burc = "Boga";
                    }else{
                        burc = "Ikizler";
                    }
                }else if(ay == 6){
                    if (gun <= 22){
                        burc = "Ikizler";
                    }else{
                        burc = "Yengec";
                    }
                }else if(ay == 7){
                    if (gun <= 22){
                        burc = "Yengec";
                    }else{
                        burc = "Aslan";
                    }
                }else if(ay == 8){
                    if (gun <= 22){
                        burc = "Aslan";
                    }else{
                        burc = "Basak";
                    }
                }else if(ay == 9){
                    if (gun <= 22){
                        burc = "Basak";
                    }else{
                        burc = "Terazi";
                    }
                }else if(ay == 10){
                    if (gun <= 22){
                        burc = "Terazi";
                    }else{
                        burc = "Akrep";
                    }
                }else if(ay == 11){
                    if (gun <= 21){
                        burc = "Akrep";
                    }else{
                        burc = "Yay";
                    }
                }else if(ay == 12){
                    if (gun <= 21){
                        burc = "Yay";
                    }else{
                        burc = "Oglak";
                    }
                }
                System.out.println("Burcunuz : "+burc);
            }else {
                System.out.println("Hatali giris yaptiniz!!");
            }
        }else {
            System.out.println("Hatali giris yaptiniz!!");
        }

    }
}