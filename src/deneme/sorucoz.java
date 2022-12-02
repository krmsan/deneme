package deneme;

import java.util.Scanner;

public class sorucoz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("sayi1 i gir");
        int sayi1 = scan.nextInt();
        System.out.println("sayi2 gir");
        int sayi2 = scan.nextInt();
        System.out.println("sayi1: " + sayi1 + "\nsayi2: " + sayi2);
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("sayi1: " + sayi1 + "\nsayi2: " + sayi2);

         /* veya
         int sayi3=sayi1;
         sayi1=sayi2;
         sayi2=sayi3;


          */
        System.out.println("yeni sayi1: " + sayi1 + "\nyeni sayi:2 " + sayi2);


    }
}
