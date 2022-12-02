package deneme;

import java.util.Scanner;

public class Sor {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("isminizi yaz");
        String isim =scan.nextLine();

        System.out.println("Soyisminizi giriniz");
        String soy=scan.nextLine();

        System.out.println("yasınız");
        double yas=scan.nextDouble();

        System.out.println("Isminiz : " +isim+
                "\nSoyisminiz : " +soy+
                "\nYasiniz : " +yas+
                "\nKaydiniz basariyla tamamlanmistir");


    }
}
