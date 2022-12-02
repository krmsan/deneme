package deneme;

public class C extends B{
    public static void main(String[] args) {
A objc=new C();
        System.out.println("objc.method() = " + objc.method());
        System.out.println("objc.var = " + objc.var);
    }
    String method(){
        return "omer";
    }
}
