package deneme;

public class C3_rakamlartop_for {
    public static void main(String[] args) {

        int sayi = 154333;
        int b1 = 0;
        int top = 0;
        String str = "" + sayi;
        System.out.println(str);
        int say = str.length();

        for (int i = 1; i <= say; i++) {
            b1 = sayi % 10;
            sayi = sayi / 10;
            top = top + b1;
            System.out.print(b1);
        }
        System.out.println("\n" + top);
    }
}
