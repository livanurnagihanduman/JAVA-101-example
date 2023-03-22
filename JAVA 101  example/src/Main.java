
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

        // Taksimetre Hesaplayan Program

        Scanner a = new Scanner(System.in);
        System.out.print("\n");

        double yol ;
        System.out.print("Lütfen gidilen mesafeyi km cinsinden yazınız: ");
        yol = a.nextDouble();
         double hesapla = yol * 7.5;
         System.out.print("Ödnecek tutar TL cinsinden: " + hesapla);


         // Dairenin Çevresini ve Alanını Hesaplayan Program

        Scanner b = new Scanner(System.in);
        System.out.print("\n");

        float sayi1;
        float sayi2 = 3.14F;

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi1 = b.nextFloat();

        double cevre = 2*sayi2*sayi1;
        System.out.print("Dairenin Çevresi: " + cevre);

        System.out.print("\n");

        double alan = sayi2*(sayi1*sayi1);
        System.out.print("Dairenin Alanı: " + alan);

        // Manav Kasa Programı

        Scanner c = new Scanner(System.in);

        System.out.print("\n");

        float elmaFiyat = 3.67F , portakalFiyat = 2.14F ,muzFiyat = 0.95F ,domatesFiyat = 1.1F ,balcanFiyat = 5.0F;

        int elmaMiktari;
        System.out.print("Kaç kilo elma? ");
        elmaMiktari = c.nextInt();
        double hesap2 = elmaMiktari*elmaFiyat;
        System.out.print("Ödenecek tutar: " + hesap2);

        System.out.print("\n");

        int portakalMiktari;
        System.out.print("Kaç kilo portakal? ");
        portakalMiktari = c.nextInt();
        double hesap1 = portakalMiktari*portakalFiyat;
        System.out.print("Ödenecek tutar: " + hesap1);

        System.out.print("\n");

        int muzMiktari;
        System.out.print("Kaç kilo muz? ");
        muzMiktari = c.nextInt();
        double hesap3 = muzMiktari*muzFiyat;
        System.out.print("Ödenecek tutar: " + hesap3);

        System.out.print("\n");

        int domatesMiktari;
        System.out.print("Kaç kilo domates? ");
        domatesMiktari = c.nextInt();
        double hesap4 = domatesMiktari*domatesFiyat;
        System.out.print("Ödenecek tutar: " + hesap4);


        System.out.print("\n");

        int balcanMiktari;
        System.out.print("Kaç kilo balcan? ");
        balcanMiktari = c.nextInt();
        double hesap5 = balcanMiktari*balcanFiyat;
        System.out.print("Ödenecek tutar: " + hesap5);












    }
}