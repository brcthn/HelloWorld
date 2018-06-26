import java.util.Arrays;
import java.util.Scanner;

public class StringSpecial {

    /**
     * asd
     * asd
     *
     * @paasdram args
     */
    public static void main(String[] args) {

        length("Eylul");
        length("AysemNeOlurGeriDon");
        charindex("burcu", 4);
        charindex("AysemNeOlurGeriDon", 8);
        toLowerCase("BURCUHASAN");
        toUppercase("jdnfjhdbjdhvjmds");
        endswith("burcu");
        endswith("burcuha");
        getchar1("eylul");
        isembty1("burcu");
        isembty1("");
        replace("burcur");
        substring("burcu");
        substring1("burcu");
        tochararray("burcu");
        substring2("alitahan", 3);
        indexof("burcu", 'u');
        indexof1("butrurcu", "ur");
        lastindexof("burcu", 'u');
        //trim("Burcu Tahan");
        split("Bir garip Orhan Veli'yim. Veli'nin oglu. Tarifsiz kederler icinde.");

    }

    /**
     * Girilen string in uzunlugunu bulu
     *
     * @param text
     */
    public static void length(String text) {
        System.out.println(text.length());

    }


    /**
     * Girilen stringin istenen indexindeki karakteri ekrana yazdirir
     *
     * @param name
     * @param number
     */
    public static void charindex(String name, int number) {
        System.out.println(name.charAt(number));
    }


    /**
     * girilen verileri kucuk harflere cevirir.
     */
    public static void toLowerCase(String text1) {

        System.out.println(text1.toLowerCase());
    }

    /**
     * girilenleri buyuk harfe cevirir
     */
    public static void toUppercase(String text2) {

        System.out.println(text2.toUpperCase());
    }

    /**
     * belirtilen son ekle bitip bitmedigini kontrol eder.
     *
     * @param
     */
    public static void endswith(String text3) {
        if (text3.endsWith("ha")) {
            System.out.println("true");


        } else {
            System.out.println("false");
        }

    }

    /**
     * kes kopyala yapistir.
     */
    public static void getchar(String text4) {
        char[] hedef = {' ', ' '};

        text4.getChars(1, 3, hedef, 0);

        System.out.println(hedef);

    }

    public static void getchar1(String text4) {
        char[] hedef = {'b', 'u', ' '};
        text4.getChars(1, 4, hedef, 0);
        System.out.println(hedef);

    }

    /**
     * string in ici bos mu?
     * uzunluk sifir olursa true
     */
    public static void isembty1(String text4) {
        if (text4.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    /**
     * yerini baska  birseyle degistirme
     */
    public static void replace(String text4) {

        System.out.println(text4.replace('r', 'h'));

    }

    /**
     * alt dize olusturma
     */
    public static void substring(String text4) {
        System.out.println(text4.substring(2, 4));
    }

    public static void substring2(String text4, int index) {
        String name = text4.substring(0, index);

        String surname = text4.substring(index, text4.length());
//        String surname= text4.substring( index);

        System.out.println(surname + name);
    }


    /**
     * sonuna kadar gitmesi
     */
    public static void substring1(String text4) {
        System.out.println(text4.substring(3));
    }

    /**
     * char listesine donusturur
     */
    public static void tochararray(String text4) {
        char[] harfler = text4.toCharArray();
        for (int i = 0; i < harfler.length; i++) {
            System.out.println(harfler[i]);
        }
    }

    /**
     * harfin sirasini bulur
     *
     * @param text4
     */
    public static void indexof(String text4, char harf) {
        System.out.println(text4.indexOf(harf));
    }

    /**
     * hecenin sirasini bulur
     *
     * @param text4
     * @param hece
     */
    public static void indexof1(String text4, String hece) {
        System.out.println(text4.indexOf(hece));
    }

    /**
     * harfi testen arar, duz sirasini bulur
     * <p>
     * burcu'da  u harfini aradik. En sondan aramaya basladi.
     * Buldugu u nun sirasini dondu
     *
     * @param text4
     * @param harf
     */
    public static void lastindexof(String text4, char harf) {
        System.out.println(text4.lastIndexOf(harf));
    }

//    /**
//     * girilen string'den bosluklari atar
//     * @param text4
//     */
//    public static void trim(String text4){
//        System.out.println(text4.trim());
//        System.out.println(("ashgdf"+' '+"sdjfhjhd").trim());
//    }


    /**
     * istaenilen yerden boler ve o harfi/string i siler. string listesi doner
     *
     * @param text4
     */
    public static void split(String text4) {
        String[] kelimeler = text4.split(" ");
        String[] kelimeler1 = text4.split("a");
        String[] kelimeler2 = text4.split("Orhan");

//        System.out.println(Arrays.toString(kelimeler));
//        System.out.println(Arrays.toString(kelimeler1));
//        System.out.println(Arrays.toString(kelimeler2));


        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }
    }



}


