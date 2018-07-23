package hackerrank;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Hk2();
        HK3();
    }

    public static void Hk1() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (5 < N && N < 21) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }


    public static void Hk2() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void HK3() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            String ara="";
             if(0<x && x<10){
                 ara=ara+0+0;
             }else if(9<x && x<100){
                 ara=ara+0;
             }


             for(int j =0;j<15-s1.length();j++){
                 ara = " " + ara;
             }



            System.out.printf("%s%s%d",s1,ara,x);
            System.out.println();
        }
        System.out.println("================================");
    }
}