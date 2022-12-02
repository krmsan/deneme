package deneme;

public class C2_rakamlartop_if {
    public static void main(String[] args) {

        int sayi =1543;
        int b1=0;
        int o1=0;
        int y1=0;
        int b2=0;
        int top=0;

        if (!(sayi%10==0)) {
            System.out.println(b1=sayi%10);
            sayi=sayi/10;
            top=top+b1;
        }
        if (!(sayi%10==0)) {
            System.out.println(o1=sayi%10);
            sayi=sayi/10;}
        if (!(sayi%10==0)) {
            System.out.println(y1=sayi%10);
            sayi=sayi/10;}
        if (!(sayi%10==0)) {
            System.out.println(b2=sayi%10);
            sayi=sayi/10;}
        System.out.println(""+b1+b2+o1+y1);//3145
        System.out.println(top=b1+b2+o1+y1);
        System.out.println("*********");


       b1= sayi%10;
       sayi=sayi/10;
       top=top+b1;

        b1= sayi%10;
        sayi=sayi/10;
        top=top+b1;

        b1= sayi%10;
        sayi=sayi/10;
        top=top+b1;

        b1= sayi%10;
        sayi=sayi/10;
        top=top+b1;
        System.out.println(top);

    }
}
