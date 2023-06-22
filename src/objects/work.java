package objects;

import java.util.Scanner;

public class work {
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        int i = 0;

        do {
            i = deger.nextInt();
            System.out.println("i 0");
        }
        while(i<0 || i>8);

        System.out.println("i !0");

    }




}
