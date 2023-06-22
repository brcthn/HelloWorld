package datastructures;

import java.util.HashMap;
import java.util.Map;

public class mapExample {


    public static void main(String[] args) {

        String str = "hasantahanburcutahan";

        Map<Character,Integer> charCount=new HashMap<>();
         char[] list= str.toCharArray();
        for( int i=0;i<list.length;i++){
            if(!charCount.containsKey(list[i])){
                charCount.put(list[i],1);
            } else{
               int value= charCount.get(list[i])+1;
               charCount.put(list[i],value);
            }
        }
        System.out.println(charCount);









    }



}
