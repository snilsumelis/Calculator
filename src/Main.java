import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int n1, n2,option;
        double sonuc= 0;

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        n1 = input.nextInt();
        System.out.print("\nbir sayı giriniz:");
        n2 = input.nextInt();
        System.out.print("\nyapmak istediginiz islemi seciniz. \n Toplama = 1,\n cıkartma = 2,\n carpma = 3,\n bolme = 4, ");
        option = input.nextInt();

        switch (option){
            case 1:
                sonuc = n1+n2;
                break;
            case 2:
                sonuc = n1 - n2;
                break;
            case 3:
                sonuc = n1*n2;
                break;
            case 4:
                sonuc= n1/n2;
                break;
            default:
                System.out.print("gecerli bir deger giriniz");
                break;

        }
        System.out.print(sonuc);
    }
}
