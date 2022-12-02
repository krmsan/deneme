package deneme;

public class D01_if {
    public static void main(String[] args) {
        int a;

        for(a=0;a<3;a++){
            System.out.println(a);
        }
        System.out.println("dısardaki=>"+a);// a dısarda tanımlı diye 3 yazdı


        {
            int i = 0;
            if (i < 3) {

                System.out.println(i);//0
                i++;
            }
            if (i < 3) {
                System.out.println(i);//1
                i++;
            }
            if (i < 3) {
                System.out.println(i);//2
                i++;//3
            }
        }
        //System.out.println(i); yazmaz
    }


}
