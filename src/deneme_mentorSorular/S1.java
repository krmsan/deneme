package deneme_mentorSorular;

import java.util.Random;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {

        //       * (Oyun: piyango) Madde 3.8 Lottery.java ‘yı yeniden düzenleyerek üç basamaklı
        //		 * sayılardan bir piyango oluşturun. Program kullanıcıdan üç basamaklı bir sayı
        //		 * alsın ve aşağıdaki kurallara göre kazancını göstersin: 1. Eğer girilen sayı
        //		 * piyangoda kazanan sayı ile birebir aynısı ise; ödül 10 000 TL 2. Eğer girilen
        //		 * sayının tüm basamakları piyangoda kazanan sayı ile aynı ise; ödül 3 000 TL 3.
        //		 * Eğer girilen sayının bir basamağı piyangoda kazanan sayı ile aynı ise; ödül 1 * 000 TL
        Random rnd = new Random();

        String piyango = "" + (rnd.nextInt(1000000)+100);

        Scanner scan = new Scanner(System.in);
        System.out.println(piyango.length() + " basamaklı sayı gir");
        System.out.println(piyango);
        int input_sayi = scan.nextInt();
        String input = "" + input_sayi;


        if (input.length() == piyango.length()) {
            if (input.equals(piyango)) {
                System.out.println("piyagongo 10000 tl kazandınız ");
            } else {
                //=============== piyangoda input rakamlarını arıyoruz ==============

                int kacRakamTuttu = 0;
                for (int i = 0; i < piyango.length(); i++) {
                    for (int j = 0; j < input.length(); j++) {
                        if (piyango.charAt(i) == input.charAt(j)) {
                            kacRakamTuttu++;
                            break;
                        }
                    }
                }
                if (kacRakamTuttu == piyango.length()) {
                    System.out.println(kacRakamTuttu + " tane aynı rakam var 3000 tl ödul kazandınız");
                } else if (kacRakamTuttu > 0) {
                    System.out.println(kacRakamTuttu + " tane rakam aynı 1000 tl ödül kazandınız");
                } else {
                    System.out.println("hiç bir rakam eslesmedi kazanamadınız");
                }
            }
        }else {
            System.out.println("yanlis giris yaptınız "+piyango.length()+" basamaklı sayı girmeliydin");
        }
    }
}