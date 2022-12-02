package deneme_mentorSorular;

import java.util.Random;
import java.util.Scanner;

public class S1_yeni {
    public static void main(String[] args) {
        Random rnd = new Random();
        String piyango = "" + rnd.nextInt(10000);

        Scanner scan = new Scanner(System.in);
        System.out.println(piyango.length() + " basamaklı sayı gir");

        int input_sayi = scan.nextInt();
        String input = "" + input_sayi;
        System.out.println(piyango);
        int kacTaneBulundu = 0;


        for (int i = 0; i < input.length(); i++) {
            int flag = 0;
            for (int j = 0; j < piyango.length(); j++) {
                if (input.charAt(i) == piyango.charAt(j)) {
                    kacTaneBulundu++;
                    flag++;
                }
            }
            if (flag == 0) {
                System.out.println("bulunmuyor.");
            }


        }

    }
}