package deneme;

public class C1_rakamlartop {
    public static void main(String[] args) {

        int sayi =1543;
        int b1=0;
        int o1=0;
        int y1=0;
        int b2=0;

        System.out.println(b1=sayi%10);//3
        System.out.println(sayi=sayi/10);//154
        System.out.println(o1=sayi%10);//4
        System.out.println(sayi=sayi/10);//15
        System.out.println(y1=sayi%10);//5
        System.out.println(sayi=sayi/10);//1
        System.out.println(b2=sayi%10);//1

        int top=b1+o1+y1+b2;
        System.out.println(top);//13



    }
}
