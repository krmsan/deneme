package deneme;

public class Method_classvar {
    static int sayi=0;

    public static void main(String[] args) {
        System.out.println(sayi);//0
        abc();
        System.out.println(sayi);//1
        def();
        System.out.println(sayi);//10
        abc();
        System.out.println(sayi);//11

    }

    static void abc(){
        sayi++;
    }
    static void def(){
        sayi=10;
    }
}
