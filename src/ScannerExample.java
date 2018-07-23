import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        dolar();
    }


    public static void dolar() {
        Scanner deger = new Scanner(System.in);
        double degisken = 0.2;
        long degisken1 = deger.nextLong();
        System.out.println(degisken + degisken1);
    }


}
