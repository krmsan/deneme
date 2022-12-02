package deneme;

public class d1 {
    public static void main(String[] args) {
        String str = "seyhan yavuz";


        System.out.println(str.replace(" ", "_").replace("y", "Y"));
        int x = 101;

int b=0;
        for (int i = 0; i < x; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                if (i > 0) {
                    System.out.print(i+"massalah");
                    b=b+1;

                }
            }


        }
        System.out.println("\n"+b);
    }
}
