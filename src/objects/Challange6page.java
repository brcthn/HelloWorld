package objects;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
import java.util.Random;

public class Challange6page {
    public static void main(String[] args) {
        char[] hex = {'a', 'b', 'c', 'd', 'e', 'f'};
        alphabet(hex);
        String[] list = {"burcu", "lego", " hasan", "prag"};
        listfirsteelement(list);
        List<String> list1 = new LinkedList<>();
        list1.add("burcu");
        list1.add("lego");
        list1.add("hasan");
        list1.add("prag");
        listfirstremove(list1);
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list2.add(String.valueOf(i));
        }
        shuffle(list2);
        List<Integer> list3 = new LinkedList<>();
        for (int i = 0; i <= 100; i++) {
            list3.add((i));
        }
        sevendivision(list3);

        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            list4.add((i));
        }
        sevendivision2(list4);

        streamagain();
        streamsearch(54);
        newmethod();
    }

    public static void alphabet(char[] hex) {
        String toplam = " ";
        List<String> letters = new LinkedList<>();
        for (int k = 0; k < hex.length; k++) {
            toplam = toplam + hex[k];
            letters.add(toplam);
        }
        System.out.println(letters.size());
    }

    public static void listfirsteelement(String[] list) {
        List<String> newlist = new LinkedList<>();
        for (int k = 0; k < list.length; k++) {
            newlist.add(list[k]);
        }
        System.out.println(((LinkedList<String>) newlist).getFirst());
        System.out.println(((LinkedList<String>) newlist).getLast());
    }

    public static void listfirstremove(List<String> list1) {
        list1.remove(0);
        System.out.println(list1);
        list1.remove(list1.size() - 1);
        System.out.println(list1);
    }

    public static void shuffle(List<String> list2) {
        Collections.shuffle(list2);
        System.out.println(list2);
    }

    public static void sevendivision(List<Integer> list3) {
        List<Integer> newlist3 = new LinkedList<>();
        for (int k = 0; k <= list3.size(); k++) {
            if (k % 7 == 0) {
                newlist3.add(k);
            }
        }
        System.out.println(newlist3);
    }

    public static void sevendivision2(List<Integer> list4) {
        List<Integer> newlist4 = new ArrayList<>();
        for (int k = 0; k <= list4.size(); k++) {
            if (k % 7 == 0) {
                newlist4.add(k);
            }
        }
        System.out.println(newlist4);
    }


    public static List<Integer> streamagain() {
        List<Integer> numberlist = new LinkedList<>();
        for (int k = 0; k <= 100; k++) {
            Random list = new Random();
            int number = list.nextInt(2000);
            numberlist.add(number);
        }
        numberlist.stream().forEach(i -> System.out.println(i));
        return numberlist;
    }

    public static void streamsearch(int n) {
        List<Integer> number = new LinkedList<>(streamagain());
        if (number.contains(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void newmethod() {
        List<Integer> one = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            one.add(i);
        }
        long starttime = System.nanoTime();
        for (int i = 0; i < one.size(); i++) {
            one.get(i);
        }
        long finishtime = System.nanoTime();
        double elapsedTimeInSecond = (double) (finishtime - starttime) / 1_000_000_000;
        System.out.println(elapsedTimeInSecond);
        return;
    }
}