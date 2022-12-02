package deneme;

import java.util.Scanner;

public class drgdf {
    public static void main(String[] args) {


//        System.out.println('a' < 'c');
//        System.out.println(2 + 3 == 6);// 2+2=5 dderse yanlış olur

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(equals(str1, str2));

        boolean esitMi = equals(str1, str2);
        System.out.println(esitMi);
    }

    public static boolean equals(String a, String b) {

        boolean esitmi = true;
        for (int i = 0; i < a.length(); i++) {
            esitmi = a.charAt(i) == b.charAt(i);

            if (!esitmi)
                break;
        }
/*
        for (int i = 0; i < a.length(); i++) {      farklı cozum
            if(a.charAt(i) != b.charAt(i)) {
                esitmi = false;
            }
        }
*/
        return esitmi;
    }
}
