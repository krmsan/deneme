package deneme;
import java.util.Scanner;
public class denemeler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir deger gir");
        int birdegergir= scan.nextByte();
        System.out.println(birdegergir);

        System.out.println("isaim gir");
        char krk = scan.next().charAt(1);
        System.out.println(krk);

        String sayi="123456789";
        System.out.println(sayi.substring(6));//789
    }
}
