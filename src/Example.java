import java.util.Scanner;

public class Example {


    public static void main(String[] args) {

        //     number1();
        main(5);
//        maxTekSayi(63);
        main1(5);
        main2(16);
        main3(16);
        main4(3);
        main5(13);
        main6(13);
        main7(100);
        main8(4);
        main8(5);
        main9("monday");
        main9("sunday");
    }

    public static void number() {
        for (int n = 0; n < 100; n = n + 2) {
            System.out.println(n);
        }

    }

    public static void number1() {
        for (int n = 100; 0 < n; n = n - 2) {
            System.out.println(n);
        }
    }

    public static void mod(int sayi) {

        if (sayi % 2 == 0) {
            System.out.println("2'ye bolunur");
            System.out.println("Cift sayi");
        }

        if (sayi % 5 == 0) {
            System.out.println("2'ye bolunur");
        }

        if (sayi % 2 != 0) {
            System.out.println("tektir");
        }

        if (sayi % 3 == 0 || sayi % 5 == 0) {
            System.out.println("3 veya 5 in katidir");
        }

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("3 ve 5 in katidir");

        }

        if ((sayi > 0 && sayi < 100) || sayi == 200) {
            System.out.println("a");
        }

    }

    public static void numbers(int sayi) {
        for (int n = 1; n < sayi; n = n + 2) {
            System.out.println(n);
        }

    }

    public static void numbers2(int sayi) {
        for (int n = 0; sayi > n; n++) {

            if (n % 2 != 0) {
                System.out.println(n);
            }

        }
    }


    public static void maxTekSayi(int n) {
        if (n % 2 == 0) {
            System.out.println(n - 1);
        }
        if (n % 2 != 0) {
            System.out.println(n - 2);
        }
    }

    public static void main(int n) {
        System.out.println(n * n);

    }

    public static void main1(int n) {
        System.out.println(n + 1);
    }

    public static void main2(int n) {
        System.out.println(n - 10);
    }

    public static void main3(int n) {
        System.out.println(5 * n);
    }

    public static void main4(int n) {
        System.out.println(n * n * n);
    }

    public static void main5(int n) {
        int toplam = 0;
        for (int i = 0; i<n; i++) {
            if ( i % 5 == 0){
                toplam = toplam + i;
            }
        }
        System.out.println(toplam);
    }
     public static void main6(int n) {
        int toplam=0;
        for(int i=0;i<n;i++){
            if(i %3== 0 || i % 5==0) {
                toplam = toplam+i;
            }
        }
         System.out.println(toplam);
     }
     public static void main7(int i) {
            if(i % 2==0 ){
                System.out.println(i-1);
            if(i % 2!=0){
                System.out.println(i-2);
            }
        }
     }

public static void main8(int n) {

            if(n<0 || n>4){
                System.out.println("wrong parameter");
            }

            switch (n ){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;



            }
}
public static void main9(String n){
        if( n=="monday"|| n=="tuesday" || n=="wednesday" || n== "thursday"|| n=="friday"){
            System.out.println("weekdays");
        } else{
            System.out.println("weekend");

        }
}


    public static void stringal() {
        Scanner line=new Scanner(System.in);
        String degisken = "burcu";
        String degisken1 = line.nextLine();
        System.out.println(degisken+ degisken1);
    }




}