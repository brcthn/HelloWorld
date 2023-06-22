package objects;

import java.util.*;

public class challenge5 {
    public static void main(String[] args) {
        int list[] = {0x43, 0x4F, 0x43, 0x55, 0x4B, 0x20, 0x41, 0x44, 0x41, 0x4D, 0x21};
        firstquestion(list);
        int[] hex = {1, 1, 2, 2, 3, 3, 4, 5, 4, 5, 3, 1, 2};
        secondquestion(hex);
        thirdquestion(6);
        toupperlowercase("cocukadam");
        sum(100);
        sin(1, 2, Math.sqrt(3));
        cos(1, 2, Math.sqrt(3));
        System.out.println(tan(1, 2, Math.sqrt(3)));
        System.out.println(cot(1, 2, Math.sqrt(3)));
        formul(1, 2, Math.sqrt(3));
        karekok(25);
        scannersin();
        replacawrite("hasan", 'a', 't');
        replacestring("hasan tahan", "tahan", "burcu");
//        allreplace("hasan hasta oldu", "as", '.');
    }

    public static void firstquestion(int[] list) {
        for (int value : list) {
            char member = (char) value;
            System.out.print(member);
        }
    }

    public static void secondquestion(int[] hex) {
        Arrays.sort(hex);
        Set<Integer> newhex = new HashSet<>();
        for (int n : hex) {
            newhex.add(n);
        }
        for (int i = newhex.size(); i > 0; i--) {
            System.out.print(i);
        }
    }

    public static void thirdquestion(int n) {
        String toplam = "";
        for (int k = 1; k <= n; k++) {
            System.out.print(toplam + k);
            toplam = toplam + k;
            System.out.println();
        }
    }

    public static void toupperlowercase(String word) {
        word.toLowerCase();
        char[] newword = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(String.valueOf(newword[i]).toUpperCase());
            }
            if (i % 2 != 0) {
                System.out.print(String.valueOf(newword[i]).toLowerCase());
            }
        }
    }

    public static void sum(int n) {
        int toplam = 0;
        for (int i = 0; i <= n; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);
    }

    public static void sin(double n, double i, double k) {
        double[] numbers = new double[3];
        numbers[0] = n;
        numbers[1] = i;
        numbers[2] = k;
        Arrays.sort(numbers);
        System.out.println(numbers[0] / numbers[2]);
    }

    public static void cos(double n, double i, double k) {
        double[] numbers = new double[3];
        numbers[0] = n;
        numbers[1] = i;
        numbers[2] = k;
        Arrays.sort(numbers);
        System.out.println(numbers[1] / numbers[2]);
    }

    public static double tan(double n, double i, double k) {
        double[] numbers = new double[3];
        numbers[0] = n;
        numbers[1] = i;
        numbers[2] = k;
        Arrays.sort(numbers);
        double result = numbers[0] / numbers[1];
        return result;
    }

    public static double cot(double n, double i, double k) {
        double[] numbers = new double[3];
        numbers[0] = n;
        numbers[1] = i;
        numbers[2] = k;
        Arrays.sort(numbers);
        double result = numbers[1] / numbers[0];
        return result;
    }

    public static void formul(double n, double k, double i) {
        double tan2 = Math.pow(tan(n, k, i), 2.0);
        double cot2 = Math.pow(cot(n, k, i), 2.0);
        System.out.println(tan2 + cot2);
    }

    public static void karekok(double n) {
        System.out.println(Math.sqrt(n));
    }

    public static void scannersin() {
        Scanner sin = new Scanner(System.in);
        long n = sin.nextLong();
        long i = sin.nextLong();
        long k = sin.nextLong();
        double[] numbers = new double[3];
        numbers[0] = n;
        numbers[1] = i;
        numbers[2] = k;
        Arrays.sort(numbers);
        System.out.println(numbers[0] / numbers[2]);
    }

    public static void replacawrite(String text, char n, char k) {
        char[] newtext = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (newtext[i] == n) {
                newtext[i] = k;
            }
            System.out.print(newtext[i]);
        }
    }

    public static void replacestring(String text, String n, String k) {
        System.out.println(System.identityHashCode(n));
        String[] newtext = text.split(" ");
        System.out.println(System.identityHashCode(newtext[1]));
        for (int i = 0; i < newtext.length; i++) {
            if (newtext[i].equals(n)) {
                newtext[i] = k;
            }
        }
        Arrays.stream(newtext).forEach(i -> System.out.print(i + " "));
    }

    private static void immutable() {
        String a = "burcu";
        System.out.println(System.identityHashCode(a));

        a = "burcu";
        System.out.println(System.identityHashCode(a));

        a = new String("burcu");
        System.out.println(System.identityHashCode(a));

        String b = "burcu";
        System.out.println(System.identityHashCode(b));

        b = "burcu";
        System.out.println(System.identityHashCode(b));

        b = new String("burcu");
        System.out.println(System.identityHashCode(b));
    }

//    public static void allreplace(String text, String word, char nokta) {
//        //  String toplam = " ";
//        char[] newtext = text.toCharArray();
//        char[] cord = word.toCharArray();
//        String[] textt = new text();
//        for (int i = 0; i < text.length(); i++) {
//            String[] s = text.split("word", word.length());
//            System.out.print(s[i]);
//        }
//    }
}