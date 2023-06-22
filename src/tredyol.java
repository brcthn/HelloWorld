import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class tredyol {
    public static void main(String[] args) {

//        int[] arr = {1, 2, 3};
//        System.out.println(solution(arr));
  //      System.out.println(solution(18,2 ));
    //    System.out.println(solution("0000000"));
        int[] arr={1,0,0,1,1,1};
        System.out.println(Arrays.toString(solutions(arr)));


    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i < A.length + 2; i++) {
            if (Arrays.binarySearch(A, i) >= 0) {
                continue;
            } else {
                return i;
            }
        }
        return 0;
    }


    public static int solution(int N, int K) {
        int round = 0;
        while (N > 1) {
            if (N % 2 == 1 || K == 0 || N==2) {
                N = N - 1;
                round++;

            } else if (N % 2 == 0 ) {
                N = N / 2;
                round++;
                K = K - 1;
            }

        }
        return round;
    }


    public static int solution(String S) {
       int sum=0;
       char[] newS = S.toCharArray();
       for(int i=0;i<newS.length;i++){
           int pow = (int) Math.pow(2, i);
           int subsum = Character.getNumericValue(newS[newS.length-1-i]) * pow;
            sum = sum + subsum;
       }

        int round = 0;
        while (sum > 0) {
            if (sum % 2 == 1) {
                sum = sum - 1;
                round++;

            } else if (sum % 2 == 0 ) {
                sum = sum / 2;
                round++;

            }
        }
        return round;
    }

    public static int[] solutions(int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            int pow = (int) Math.pow(-2, i);
            int subsum =A[i] * pow;
            sum=sum+subsum;
        }
        int n=(int)Math.ceil(sum/2.0);
        if(n<0){
            n = 0 - n;
        }
        char[] ca = Integer.toBinaryString(n).toCharArray();
        int[] ia = new int[ca.length];
        for (int i = 0; i < ca.length; i++) {
            ia[i] = Integer.parseInt(String.valueOf(ca[i]));
        }
        return ia;

    }




}
