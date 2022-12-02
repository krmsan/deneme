package deneme_mentorSorular;

import java.util.Scanner;

public class s1_duzenli {
    public static void main(String[] args) {

        {

            //* (Oyun: piyango) Madde 3.8 Lottery.java ‘yı yeniden düzenleyerek üç basamaklı
            //		 * sayılardan bir piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı
            //		 * alsın ve aşağıdaki kurallara göre kazancını göstersin: 1. Eğer girilen sayı
            //		 * piyangoda kazanan sayı ile birebir aynısı ise; ödül 10 000 TL 2. Eğer girilen
            //		 * sayının tüm basamakları piyangoda kazanan sayı ile aynı ise; ödül 3 000 TL 3.
            //		 * Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise; ödül 1 * 000 TL

            String piyango = "123";
            int pyg = 123;

            Scanner scan = new Scanner(System.in);
            System.out.println(piyango.length() +" basamaklı sayı gir");

            int sayi = scan.nextInt();
            String sayistringi = "" + sayi;


            if (sayistringi.length()==piyango.length()) {       //sayi < 1000 && sayi > 99
                if ((pyg == sayi)) {
                    System.out.println(" 10000 tl kazandınız ");
                } else {
                    if (sayistringi.contains("1") && sayistringi.contains("2") && sayistringi.contains("3")) {
                        System.out.println("sayı piyongo rakamlarının hepsi var 3000 tl ödul kazandınız");

                    } else if (sayistringi.startsWith("1", 0) || sayistringi.startsWith("2", 1) ||
                            sayistringi.startsWith("3", 2)) {

                        System.out.println(" sadece 1 rakam aynı 1000 tl ödül kazandınız");
                    } else {
                        System.out.println(piyango.length()+"  basamklı rakam degil yanlıs giriş");
                    }
                }
            } else {
                System.out.println(piyango.length()+" basamaklı sayı degil");
            }
        }

    }
}
