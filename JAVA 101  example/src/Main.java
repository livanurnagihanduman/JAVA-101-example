
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

        //KDV Hesaplayan Program

        Scanner y = new Scanner(System.in);

        System.out.print("\n");

        int tutar;
        System.out.println("Lütfen bir tutar giriniz: ");
        tutar = y.nextInt();

        double islem = tutar * 0.5 + tutar;
        System.out.print("Tutarınızın KDV'li Hali =  " + islem);

        // Dik Üçgende Hipotenüs Bulan Program

        Scanner z = new Scanner(System.in);

        System.out.print("\n");

        int number1;
        int number2;

        System.out.print("İlk sayıyı giriniz: ");
        number1 = z.nextInt();

        System.out.print("\n");

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = z.nextInt();


        double hipotenüs = Math.pow((number1*number1)+(number2*number2),0.5);
        System.out.print("Dik Üçgenin Hipotenüs Uzunluğu = " + hipotenüs);


    }
}