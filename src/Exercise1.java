import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
//        sayi(6);
//        apostra(0.6);
//        avarage(60, 60, 50);
//        circle(6);
//        example("Was it a car or a cat I saw?");
//        example1("Did Hannah see bees? Hannah did");
//        example2("Did Hannah see bees? Hannah did.", 12);
//        referred("Did Hannah see bees? Hannah did.");
//        bler("Did Hannah see bees? Hannah did.", 'b');
//        //name();
//        //avarages();
//        ters("burcu");
//        multi();
//        sayi();
//        istenilencarpim(6);
//        starline(4);
        //       starlinereverse(4);
        //      starln(4);
        // sc();
        character("burcuhasan");
        //starone(4);
        ar("burcu");
    }


    public static void sayi(int number) {
        System.out.println(number * number);
    }

    public static void apostra(double number) {
        System.out.println(number * 0.2);

    }

    public static void avarage(float birinci, float ikinci, float ucuncu) {
        float puan = (birinci + ikinci + ucuncu) / 3;
        if (puan < 50) {
            System.out.println("KALDI");
        } else if (puan >= 50) {
            System.out.println("GECTI");
        }

    }

    public static void circle(float radius) {
        System.out.println(Math.PI * radius * radius);
    }

    public static void example(String text) {
        System.out.println(text.substring(9, 12));
    }

    public static void example1(String text) {
        System.out.println(text.length());
    }

    public static void example2(String text, int number) {
        System.out.println(text.charAt(number));
    }

    public static void referred(String text) {
        if (text == "Did Hannah see bees? Hannah did.") {
            System.out.println("No she didnt");
        } else {
            System.out.println("everything");
        }
    }

    public static void bler(String text, char harf) {
        System.out.println(text.indexOf(harf));
    }

    public static void name() {
//        Ogrenci ogrenci1 = new Ogrenci();
//         ogrenci1.adi="Hasan";
//         ogrenci1.soyad="Tahan";
//         ogrenci1.sinif="5B";
//         ogrenci1.not=70;
//
//         Ogrenci ogrenci2 = new Ogrenci();
//         ogrenci2.adi="Burcu";
//         ogrenci2.soyad="Tahan";
//         ogrenci2.sinif="5B";
//         ogrenci.not=100;
//
//
//         (ogrenci1.not+ogrenci2.not)/2


        Scanner isim = new Scanner(System.in);
        String adsoyad = isim.nextLine();
        int yas = isim.nextInt();
        System.out.println("hello" + adsoyad + " senin yasin:" + yas);
    }

    public static void avarages() {
        Scanner avarage = new Scanner(System.in);
        float puan1 = avarage.nextFloat();
        float puan2 = avarage.nextFloat();
        float puan3 = avarage.nextFloat();
        avarage(puan1, puan2, puan3);
    }

    // REVERSE

    public static void ters(String text) {
        char[] harfler = text.toCharArray();
        for (int i = harfler.length; i > 0; i--) {
            System.out.print(harfler[i - 1]);
        }
    }

    public static void multi() {
        for (int n = 1; n < 11; n++) {
            System.out.println(n + "*9 =" + n * 9);
        }
    }

    public static void sayi() {
        for (int n = 1; n < 11; n++) {
            for (int k = 1; k < 11; k++) {
                System.out.println(n + "*" + k + "=" + n * k);
            }
        }
    }

    public static void istenilencarpim(int i) {
        for (int n = 1; n < 11; n++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }

    public static void starline(int limit) {
        for (int n = 0; n < limit; n++) {
            for (int k = 0; k < n + 1; k++) {

                System.out.print('*');
            }


            System.out.println();
        }

    }

    public static void starlinereverse(int limit) {
        for (int n = 0; n < limit; n++) {
            for (int k = 0; k < limit - n; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void starln(int limit) {
        for (int n = 0; n < limit; n++) {
            for (int k = 0; k < limit - n; k++) {
                System.out.print(' ');
                System.out.print(' ');
            }
            for (int i = 0; i < (2 * n + 1); i++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }


//     public static void sc() {
//    Scanner islem = new Scanner(System.in);
//    float numberone = islem.nextFloat();
//    float numbertwo = islem.nextFloat();
//        islem.nextLine();
//    String isle = islem.nextLine();
//        if(islem ==+)
//
//    {
//        System.out.println(numberone + numbertwo);
//    } else if(islem ==-)
//
//    {
//
//    }
//        System.out.println(numberone -numbertwo);

    public static void character(String kelime) {
        int adet = 0;
        Character[] unluler = {'a', 'e', 'i', 'u', 'o'};

        for (int i = 0; i < kelime.length(); i++) {

            for (int j = 0; j < unluler.length; j++) {
                if (kelime.charAt(i) == unluler[j]) {
                    adet++;
                }
            }


        }

        System.out.println(adet);

    }


//    public static void starone(int limit) {
//        for (int i = 0; i < limit; i++) {
//            for (int k = 0; k < i + 1; k++) {
//                System.out.println('a');
//            }
//            for (int n = 0; n < (2 * n + 1); n++) {
//                System.out.println('*');
//            }
//        }
//
//    }

    public static void ar(String isim) {
        char [ ] harfler = isim.toCharArray();

        for (int i = isim.length()-1; i >= 0; i--) {

            System.out.print(harfler[i]);
        }
    }
}
