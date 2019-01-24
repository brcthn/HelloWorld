package objects;

import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
//        sentence("Seni cok seviyorum Askim");
//        sum(30,40,50,30,60);
//        multiplicationtable();
//        seven();
//        eleven();
//        number(100);
//        lastvowels("burcu");
//        combining("burcu","hasan");
//        same("gotum bu sorulur mu");
//        add('a');
//        factorial(5);
//        vowel("burcuhasan");

        //      System.out.println(justrepeat("burcuhasan"));
//        intrepeat(1234);
//        addstring("naber");
        //       scannerfirst();
//        scannersum();
        //       scanneraddword();
        //     select();
        //      nottogether();
//          nottogetherr();
        //      star(3);
        //      star1(4);
        //     cube(5);
        //   difference(20,10);
//           System.out.println(obeb(42,15));
//           ekok(6,17);
        //  numberwriter(20);
        //  consonant("aysemneolurgeridon");
        // bomgame(5);
        //  allofthem("bcçdfgğhjklmnprsştvyzaıoueiöü");
        //  allofthem("asdsd");

        //     System.out.println( unigsessiz("aysemneolurgeridonayse"));
      //  lastquestion(1000);
        fibonnanci(7);
    }

    public static void sentence(String text) {
        System.out.println(text);
    }


    public static void sum(int n, int k, int l, int i, int m) {
        System.out.println(n + k + l + i + m);
    }

    public static void multiplicationtable() {
        for (int h = 1; h < 11; h++) {
            for (int k = 1; k < 11; k++) {
                System.out.println(h + "*" + k + "=" + h * k);

            }
        }
    }


    public static void seven() {
        for (int i = 1; i < 15; i++) {
            System.out.println(7 * i);
        }
    }

    public static void eleven() {
        for (int i = 1; i < 10; i++) {
            System.out.println(11 * i);
        }
    }

    public static void number(int n) {
        for (int i = 1; i < 100; i++) {
            int result = i * n;
            if (result < 101) {
                System.out.println(result);
            }
        }
    }

    public static void lastvowels(String text) {
        System.out.println(text.charAt(text.length() - 1));

    }

    public static void combining(String first, String second) {
        String last = first.concat(second);
        System.out.println(last);
    }

    public static void same(String text) {
        System.out.println(text);
    }

    public static void add(char n) {
        String s = String.valueOf(n);
        String last = s.concat(s);
        System.out.println(last);

    }

    public static void factorial(int n) {
        if (n < 0) {
            System.out.println("sifirdan buyuk bir sayi giriniz");
        }
        if (n == 0 && n == 1) {
            System.out.println(1);
        }
        if (n > 1) {
            int carpim = 1;
            for (int i = 1; i < n; i++) {
                carpim = carpim * (n - i);
            }
            System.out.println(n * carpim);
        }
    }

    public static void vowel(String text) {
        String toplam = " ";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (list[i] == 'a' || list[i] == 'e' || list[i] == 'i' || list[i] == 'ö' || list[i] == 'ü' || list[i] == 'o' || list[i] == 'u' || list[i] == 'ı') {
                toplam = toplam + list[i];
            }
        }
        System.out.println(toplam);


    }

    public static String justrepeat(String text) {


        String toplam = "";
        char[] list = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (list[i] == 'a' || list[i] == 'e' || list[i] == 'i' || list[i] == 'ö' || list[i] == 'ü' || list[i] == 'o' || list[i] == 'u' || list[i] == 'ı') {
                if (!toplam.contains(String.valueOf(list[i]))) {


                    toplam = toplam + list[i];
                }


            }

        }
        return (toplam);
    }


    public static void intrepeat(int number) {
        String toplam = "";
        String list = String.valueOf(number);
        char[] list1 = list.toCharArray();
        for (int i = 0; i < list1.length; i++) {
            if (!toplam.contains(String.valueOf(list1[i]))) {
                toplam = toplam + list1[i];


            }
        }
        if (toplam.length() < list.length()) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }


    public static void addstring(String word) {
        System.out.println(word + " la bebe");
    }


    public static void scannerfirst() {
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        System.out.println(name1);
    }


    public static void scannersum() {


        Scanner sum = new Scanner(System.in);
        int number = sum.nextInt();
        System.out.println(number + 1);

    }

    public static void scanneraddword() {
        Scanner word = new Scanner(System.in);
        String ad = word.nextLine();
        addstring(ad);
    }


    public static void select() {
        Scanner vowel = new Scanner(System.in);
        String word = vowel.nextLine();
        if (word.contains("hb")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void nottogether() {
        Scanner vowel = new Scanner(System.in);
        String word = vowel.nextLine();

        if (word.contains(String.valueOf('b')) && word.contains(String.valueOf('h'))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }


    public static void nottogetherr() {
        Scanner vowel = new Scanner(System.in);
        String word1 = vowel.nextLine();

        if (word1.contains(String.valueOf('b')) || word1.contains(String.valueOf('h'))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }

    public static void star(int number) {
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number; k++) {

            }
            System.out.println("*");

        }

    }


    public static void star1(int number) {
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number; k++) {

            }
            System.out.print("*");


        }
    }


    public static void cube(int number) {
        for (int i = 0; i < number; i++) {
            for (int k = 0; k < number; k++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void difference(int n, int k) {
        System.out.println(Math.abs(n - k));
    }


    public static int obeb(int a, int b) {

        int enbuyuk, enkucuk, r;
        if (a > b) {
            enbuyuk = a;
            enkucuk = b;
        } else {
            enbuyuk = b;
            enkucuk = a;

        }
        while (enkucuk != 0) {
            r = enbuyuk % enkucuk;
            enbuyuk = enkucuk;
            enkucuk = r;

        }


        return enbuyuk;
    }

    public static void ekok(int a, int b) {
        int ekok = (a * b) / obeb(a, b);
        System.out.println(ekok);
    }

    public static void numberwriter(int n) {
        int birler = 0;
        if (10 <= n && n < 20) {
            birler = n - 10;
            System.out.print("on");
        } else if (20 <= n && n < 30) {
            birler = n - 20;
            System.out.print("yirmi");
        } else if (30 <= n && n < 40) {
            birler = n - 30;
            System.out.println("otuz");
        } else if (40 <= n && n < 50) {
            birler = n - 40;
            System.out.println("kirk");
        } else if (50 <= n && n < 60) {
            birler = n - 50;
            System.out.println("elli");
        } else if (n <= 60 && n < 70) {
            birler = n - 60;
            System.out.println("altmis");
        } else if (n <= 70 && n < 80) {
            birler = n - 70;
            System.out.println("yetmis");
        } else if (n <= 80 && n < 90) {
            birler = n - 90;
            System.out.println("seksen");
        } else if (n <= 90 && n < 100) {
            birler = n - 90;
            System.out.println("doksan");
        }


        switch (birler) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
        }
    }

    public static void consonant(String text) {
        String toplam = " ";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (list[i] != 'a' && list[i] != 'e' && list[i] != 'i' && list[i] != 'ö' && list[i] != 'ü' && list[i] != 'o' && list[i] != 'u' && list[i] != 'ı') {

                toplam = toplam + list[i];
            }

        }
        System.out.println(toplam);


    }

    public static void bomgame(int n) {
        for (int i = 1; i < 100; i++) {
            if (i % n != 0) {
                System.out.println(i);
            } else {

                System.out.println("bom");
            }
        }
    }

    public static String unigsessiz(String text) {
        String toplam = "";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (list[i] != 'a' && list[i] != 'e' && list[i] != 'i' && list[i] != 'ö' && list[i] != 'ü' && list[i] != 'o' && list[i] != 'u' && list[i] != 'ı') {
                if (!toplam.contains(String.valueOf(list[i]))) {


                    toplam = toplam + list[i];
                }
            }

        }
        return (toplam);

    }

    public static void allofthem(String text) {

        if (justrepeat(text).length() == 8) {
            if (unigsessiz(text).length() == 21) {
                System.out.println("true");
                return;
            }


        }

        System.out.println("false");


//   if (newtext[i] == 'a' && newtext[i] == 'b' && newtext[i] == 'c' && newtext[i] == 'd' && newtext[i] == 'e' && newtext[i] == 'f' && newtext[i] == 'g' && newtext[i] == 'h'  && newtext[i] == 'i' && newtext[i] == 'j' && newtext[i] == 'k' && newtext[i] == 'l' && newtext[i] == 'm' && newtext[i] == 'n' && newtext[i] == 'o' && newtext[i] == 'p' && newtext[i] == 'r' && newtext[i] == 's' && newtext[i] == 't' && newtext[i] == 'u' && newtext[i] == 'v' && newtext[i] == 'y' && newtext[i] == 'z' && newtext[i] == 'i' && newtext[i] == 'ü' && newtext[i] == 'ı' && newtext[i] == 'ç' && newtext[i] == 'ğ' && newtext[i] == 'ö' && newtext[i] == 'ş') {


    }

    public static void lastquestion(int n) {
        int toplam = 0;
        for (int i = 0; i < n; i++) {
            if (i * 3 < n) {

                toplam = toplam + i * 3;
            } else {
                break;
            }
        }
        for (int k = 0; k < n; k++) {
            if (k * 5 < n) {
                toplam = toplam + k * 5;
            } else {
                break;
            }
        }
        System.out.println(toplam);
    }

    public static void fibonnanci(int n) {


      fibonnanci(n);

        System.out.println(fibonnanci(n));


    }}