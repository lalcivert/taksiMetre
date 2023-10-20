package day01;
import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args) {

        int yol;
        double kmBasi=2.20,toplam=10;

        System.out.println("gidilecek yolun kac km oldugunu giriniz: ");
        Scanner input= new Scanner(System.in);
        yol=input.nextInt();

        toplam+=yol*kmBasi;
        System.out.println("toplam tutar: "+toplam);

        toplam=(toplam<20) ? 20 : toplam;
        System.out.println("odenecek  tutar: "+toplam);
    }
}
