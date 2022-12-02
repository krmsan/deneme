package deneme;

import java.util.Scanner;

public class C4_method {


    public static void main(String[] args) {
//        String adso;
//        adso = isimSoyisim();
//        System.out.println("adsoy: " + adso);
//        System.out.println(isimSoyisim());
        isimSoyisim();

    }

    public static void isimSoyisim() {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim");
        String x = scan.nextLine();
        String y = scan.nextLine();

        System.out.println("isim soyisim : " + x + " " + y);


//    public static String isimSoyisim  (){
//        Scanner scan =new Scanner(System.in);
//        System.out.println("isim soyisim");
//        String x=scan.nextLine();
//        String y=scan.nextLine();
//
//        return x+" "+y;
//    }

    }}