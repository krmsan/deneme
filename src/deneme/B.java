package deneme;

public class B extends A {
    String var="tuba";

    String method(){

        return "mehmet";
    }
    B(){

    }

    public static void main(String[] args) {
        B obj1=new B();



        System.out.println("super.var = " + obj1.var);

        System.out.println("obj1.method() = " + obj1.method());
    }
}
