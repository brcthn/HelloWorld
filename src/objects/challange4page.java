package objects;

import java.util.*;

public class challange4page {
    public static void main(String[] args) {
       reversestring("Lorem Ipsum");
       rock("age", "aAAgGEE");
       int[] list1 = {12, 28, 46, 32, 50};
       int[] list2 = {50, 32, 46, 28, 12};
       polidrom(list1, list2);
       String[] email1 = {"burcu@gmail.com", "hasan@gmail.com", "BuRcu@gmail.com", "HASAN@gmail.com"};
       email(email1);
       emailSolution3(email1);
       int[] list = {0, 1, 4, 9, 16, 49, 100};
       binarysearch(list, 49);
       toLowerCase("ABCDEF");
       touppercase("burCU");
       socialmedya("Gunum cok guzel");
       primenumber(7);
       mors("BURCU");
    }

    public static void reversestring(String text) {
        String[] list = text.split(" ");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }

    public static void rock(String text1, String text2)
    {
        String toplam = "";
        char[] newtext1 = text1.toCharArray();
        char[] newtext2 = text2.toCharArray();
        // if ( )){
        //   toplam=toplam+newtext1;
        for (int i = 0; i <= (newtext1.length) - 1; i++) {
            for (int k = 0; k < newtext2.length; k++) {
                if (((String.valueOf(newtext2[k])).contains(String.valueOf(newtext1[i])) == true)) {
                    toplam = toplam + newtext1[i];
                }
            }
        }
        System.out.println(toplam.length());
    }

    public static void polidrom(int[] list1, int[] list2) {
        // String A = String.valueOf(list1);
        //  String B = String.valueOf(list2);
        for (int n = 0; n < list1.length; n++) {
            if ((list1[n]) == list2[list2.length - 1 - n]) {
            } else {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }

    public static void email(String[] email1) {
        //foreach
        //lowercase
        //String tanimla bunun icerisinde var mi diye bak (contains)
        //emails in icinde yoksa ekle
        //for bittikten sonra split (,)
        // arrayin uzunlugu

        String emails = "";
        for (String n : email1) {
            String a = n.toLowerCase();
            if (emails.contains(a) != true) {
                emails = emails + a + ",";
            }
        }
        String[] emailslist = emails.split(",");
        System.out.println(emailslist.length);
    }

    public static void emailSolution2(String[] email1) {
        //foreach
        //lowercase
        //List tanimla bunun icerisinde var mi diye bak (contains)
        //List in icinde yoksa ekle
        // List uzunlugu
        List<String> list = new ArrayList<>();
        for (String n : email1) {
            String a = n.toLowerCase();
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        System.out.println(list.size());
    }

    public static void emailSolution3(String[] email1) {
        //foreach
        //lowercase
        //set tanimla
        //set e ekle
        // set uzunlugu

        Set<String> emailSet = new HashSet<>();
        for (String n : email1) {
            emailSet.add(n.toLowerCase());
        }
        System.out.println(emailSet.size());
    }

    public static void binarysearch(int[] list, int n) {
        int middle = (int) Math.ceil(((list.length) / 2));
        if (n <= list[middle]) {
            for (int i = 0; i < middle; i++) {
                if (list[i] == n) {
                    System.out.println(i);
                }
            }
        } else {
            for (int k = middle; k < list.length - 1; k++) {
                if (list[k] == n) {
                    System.out.println(k);
                }

            }
        }
    }

    public static void toLowerCase(String s) {
        for (char c : s.toCharArray()) {
            int ascii = (int) c;
            if (65 <= ascii && ascii <= 90) {
                ascii = ascii + 32;
                System.out.print((char) ascii);
            } else {
                System.out.print(c);
            }
        }
    }

    public static void touppercase(String list) {
        for (char c : list.toCharArray()) {
            int asciikod = (int) c;
            if (97 <= asciikod && asciikod <= 122) {
                asciikod = asciikod - 32;
                System.out.print((char) asciikod);
            } else {
                System.out.print(c);
            }
        }
    }

    public static void socialmedya(String text) {
        text.toLowerCase();
        if (text.contains("instagram") == true) ;
        System.out.println(text.replaceAll("instagram", "facebook")
        );
    }

    public static void primenumber(int n) {
        int toplam1 = 2;
        if (n > 8) {
            int toplam = 17;
            for (int i = 3; i < n; i = i + 1) {
                if (i >= 8) {
                    if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                        toplam = toplam + i;
                    }
                }
            }
            System.out.println(toplam);
        } else if (n < 8) {
            for (int k = 3; k < n; k = k + 2) {
                toplam1 = toplam1 + k;
            }
        }
        System.out.println(toplam1);
    }

    public static void mors(String text) {
        char[] text1 = text.toCharArray();
        String[] mors = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alfabe = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "U", "V", "Y", "Z", "Q", "W", "X", "T"};

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < mors.length; i++) {
            map.put(alfabe[i], mors[i]);
        }
        for (int k = 0; k < text.length(); k++) {

            System.out.println(map.get(String.valueOf(text1[k])));
        }
    }
}