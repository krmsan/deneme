package deneme;

public class D01_String {
    public static void main(String[] args) {
        int a=9;

        String s1;
        // System.out.println(s1);CTE

        String s=new String();
        System.out.println(s);// hiçbişey yok

        String s2="";
        System.out.println(s2);// hiçbişey yok

        //String s3=new String(3);CTE
        String s3=new String("3");
        System.out.println(s3);//3

        s2+=new String("abc");
        System.out.println(s2);//abc

        s3+=new String("abc");
        System.out.println(s3);//3abc

        Object o="obje";
        System.out.println(o);//obje

        Object r=7;
        System.out.println(r);//7

        Object obj =new String("asdf");
        System.out.println(obj);//asdf

        //Object obj1=new Integer(7); //olmuyor ustunu ciziyor

        Object obj2= new Integer(5);//ama calısıyor
        System.out.println(obj2);//5

       // String str+=obj2;CTE
       //String str+=obj;CTE
        String str="";
        str+=obj2;
        str+=obj;
        System.out.println(str);//5asdf

        String str1=(String) obj;
        //String str10= obj;   CTE farklı iki class cast etmeye calıstın ama String kucuk olan

        System.out.println(str1);//asdf

        String str3=(String) obj2;//ClassCastException  RTE
        System.out.println(str3);

        String x,y;
        x="    ";
        y="asd";
        System.out.println(x+y);



    }
}
