
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // NOT ORTALAMASI PROGRAMI


        int matNot,kimyaNot,fizikNot,biyolojiNot;

        Scanner x = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matNot = x.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimyaNot = x.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizikNot = x.nextInt();

        System.out.print("Biyolojı notunuzu giriniz: ");
        biyolojiNot = x.nextInt();

        int toplam = matNot + kimyaNot + fizikNot + biyolojiNot;
        double sonuc = toplam/4;
        System.out.print("ortalamanız: " + sonuc);





    }
}