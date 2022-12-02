package deneme;

public class Metod_instancevar {
    int sayi=0;

    public static void main(String[] args) {
        System.out.println(new Metod_instancevar().sayi);//0

        new Metod_instancevar().de();//1
        new Metod_instancevar().eg();//1
        System.out.println(new Metod_instancevar().sayi);//0
        new Metod_instancevar().de();//1

        Metod_instancevar obj=new Metod_instancevar();  //atama var yeni degerleri tutar store ediyor obj
        obj.de();//1
        obj.de();//2
        obj.eg();//3


    }
    void de(){
        sayi++;
        System.out.println(sayi);
    }
    void eg(){
        sayi++;
        System.out.println(sayi);
    }
}
