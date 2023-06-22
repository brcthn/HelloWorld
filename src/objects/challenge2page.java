package objects;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Arrays;

public class challenge2page<toplam> {
    public static void main(String[] args) {
        wantchar("ashsdkjkdhjdf", 5);
        combination("burcu", "tahan");
//        compare("burcu","hasan");
        replace("hasan");
        replaceword("Hasan eve gel");
        bigcharacter("hasan ve burcu");
        smallcharacter("burcu Ve Hasan");
        repeatcharacter("burctttu");
        repeatcharactersecond("burctttu");
        unique("burcu");
        firstunique("burcub");
        takenumber("Loremlpsum");
        palindrome("teaaet");
        repeatwrite("LoremIpsum");
        sum(10, 20, 30);
        sumn(3);
        avarage(10, 20, 30, 40, 50);
        int[] array = {1, 2, 3};
        sumarray(array);
        int[] a = {1, 2, 3};
        avaragearray(a);
        int[] c = {5, 2, 3};
        lastarray(c);
        int[] left = {6, 2, 10, 4, 5};
        leftshift(left);
        int[] list = {10, 5, 6};
        kucuktenbuyuge(list);
        int[] list1 = {10, 5, 6};
        buyuktenkucuge(list1);
        int[] list2 = {6, 2, 10, 4, 5};
        change(list2);
        int[] list3 = {6, 2, 10, 4, 5};
        enkucukeleman(list3);
        int[] list4 = {6, 2, 10, 4, 5};
        enbuyuksayi(list4);
        int[] list5 = {10, 10, 10, 3, 3};
        uniquetopla(list5);
        stringremove("LoremIpsum", "su");
        lastquestion("This is not my problem");
        blackjack(21, 21);
    }

    public static void wantchar(String text, int number) {
        System.out.println(text.charAt(number));
    }

    public static void combination(String text1, String text2) {
        System.out.println(text1.concat(text2));
    }

    public boolean compare(String text1, String text2) {
        String toplam = "";
        char[] list1 = text1.toCharArray();
        char[] list2 = text2.toCharArray();
        for (int i = 0; i < list2.length; i++) {
            if (list1[i] == list2[i]) {
                toplam = toplam + list2[i];
            }
        }
        if (toplam.length() == list1.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void replace(String text) {
        System.out.println(text.replace('h', 'b'));
    }

    public static void replaceword(String text) {
        String smallvowel = text.toLowerCase();
        System.out.println(smallvowel.replaceAll("hasan", "Burcu"));
    }

    public static void bigcharacter(String text) {
        System.out.println(text.toUpperCase());
    }

    public static void smallcharacter(String text) {
        System.out.println(text.toLowerCase());
    }

    public static void repeatcharactersecond(String text) {
        String toplam = "";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            for (int k = 0; k < text.length(); k++) {
                if (list[i] == list[k]) {
                    toplam = toplam + list[k];
                }
            }
            toplam = toplam + " ";
        }
        int result2 = 0;
        char last2 = ' ';
        int result = 0;
        char last = ' ';
        String[] yeni = toplam.split(" ");
        for (int i = 0; i < yeni.length; i++) {
            if (yeni[i].length() > result) {
                result2 = result;
                last2 = last;
                result = yeni[i].length();
                last = yeni[i].charAt(0);
            }
        }
        System.out.println(last2);
    }

    public static void repeatcharacter(String text) {
        String toplam = "";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            for (int k = 0; k < text.length(); k++) {
                if (list[i] == list[k]) {
                    toplam = toplam + list[k];
                }
            }
            toplam = toplam + " ";
        }
        int result = 0;
        char last = ' ';

        String[] yeni = toplam.split(" ");
        for (int i = 0; i < yeni.length; i++) {
            if (yeni[i].length() > result) {
                result = yeni[i].length();
                last = yeni[i].charAt(0);
            }
        }
        System.out.println(last);
    }

    public static void unique(String text) {
        String toplam = "";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (!toplam.contains(String.valueOf(list[i]))) {
                toplam = toplam + list[i];
            }
        }
        System.out.println(toplam);
    }

    public static void firstunique(String text) {
        String toplam = "";
        char[] list = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            for (int k = 0; k < text.length(); k++) {
                if (list[i] == list[k]) {
                    toplam = toplam + list[k];
                }
            }
            toplam = toplam + " ";
        }
        String sontoplam = "";
        String[] yeni = toplam.split(" ");
        for (int i = 0; i < yeni.length; i++) {
            if (yeni[i].length() == 1) {
                sontoplam = sontoplam + yeni[i];
            }
        }
        System.out.println(sontoplam.charAt(0));
    }

    public static void takenumber(String text) {
        String toplam = "";
        String list1 = text.toLowerCase();
        char[] list = list1.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (list[i] == 'a' || list[i] == 'e' || list[i] == 'i' || list[i] == 'ö' || list[i] == 'ü' || list[i] == 'o' || list[i] == 'u' || list[i] == 'ı') {

                toplam = toplam + list[i];
            }
        }
        System.out.println("sesli" + "=" + toplam.length() + " " + "sessiz" + "=" + (text.length() - toplam.length()));
    }

    public static boolean palindrome(String text) {

        char[] list = text.toCharArray();

        for (int i = 0; i < Math.ceil(text.length() / 2); i++) {
            if (text.lastIndexOf(list[i]) == text.lastIndexOf(list[text.length() - 1 - i])) {
            } else {
                return false;
            }
        }
        return true;
    }
    public static void repeatwrite(String text) {
        String list = text.substring(text.length() - 2, text.length());
        System.out.println(list + list + list);
    }

    public static void sum(int n, int k, int b) {
        System.out.println(n + k + b);
    }

    public static void sumn(int n) {
        int toplam = 0;
        for (int i = 0; i <= n; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);
    }

    public static void avarage(int n, int k, int b, int h, int m) {
        int toplam = n + k + b + h + m;
        System.out.println(toplam / 5);
    }

    public static void sumarray(int[] sum) {
        int toplam = 0;
        for (int i = 0; i < sum.length; i++) {
            toplam = toplam + sum[i];
        }
        System.out.println(toplam);
    }

    public static void avaragearray(int[] a) {
        int toplam = 0;
        for (int i = 0; i < a.length; i++) {
            toplam = toplam + a[i];
        }
        System.out.println(toplam / a.length);
    }

    public static void reversearray(int[] b) {
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
        }
    }

    public static void lastarray(int[] c) {
        if (c[c.length - 1] == 5 || c[0] == 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void leftshift(int[] left) {
        String toplam = "";
        for (int i = 1; i < left.length; i++) {
            toplam = toplam + left[i] + " ";
        }
        System.out.print(toplam + " " + left[0]);
    }

    public static void kucuktenbuyuge(int[] list) {
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void buyuktenkucuge(int[] list1) {
        Arrays.sort(list1);
        for (int i = list1.length - 1; i > -1; i--) {
            System.out.println(list1[i]);
        }
    }

    public static void change(int[] list2) {
        int a = 0;
        a = a + list2[0];
        list2[0] = list2[list2.length - 1];
        list2[list2.length - 1] = a;
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }
    }


    public static void enkucukeleman(int[] list3) {
        Arrays.sort(list3);
        System.out.println(list3[0]);
    }

    public static void enbuyuksayi(int[] list4) {
        Arrays.sort(list4);
        System.out.println(list4[list4.length - 1]);
    }

    public static void uniquetopla(int[] list5) {
        int toplam = 0;
        for (int k = 0; k < list5.length; k++) {
            for (int i = k + 1; i < list5.length; i++) {
                if (list5[k] == list5[i]) {
                    list5[i] = 0;
                }
            }
        }
        for (int j = 0; j < list5.length; j++) {
            toplam = toplam + list5[j];
        }
        System.out.println(toplam);
    }

    public static void stringremove(String list1, String list2) {
        list1.toLowerCase();
        list2.toLowerCase();
        String last = list1.replaceFirst(list2, "");
        System.out.println(last);
    }

    public static void lastquestion(String text) {
        String[] is = text.split(" is ");
        String[] not = text.split(" not ");
        if (is.length == not.length) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void blackjack(int a, int b) {
        if (a < 21 && b < 21) {
            if (a < b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } else if (a >= 21 && b >= 21) {
            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (a == b) {
            System.out.println(" a esittir b ");
        }
    }
}

