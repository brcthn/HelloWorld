package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {
        linkedlistExample();
        arraylistbook();
        arraylistExample();
    }

    private static void arraylistExample() {
        List<String> goller = new ArrayList<>();
        goller.add("Sneijder");
        goller.add("Gomis");
        goller.add("Belhanda");
        goller.add("Rodriges");
        goller.add("Muslera");
        goller.add("Gomis");
        goller.add("Gomis");
        goller.add("Gomis");

        goller.remove("Gomis");

        for(int i=0; i< goller.size(); i++){
            System.out.println(goller.get(i));
        }
    }

    private static void linkedlistExample() {
        List<String> myLink = new LinkedList<>();
        myLink.add("Sneijder");
        myLink.add("Gomis");
        myLink.add("Belhanda");
        myLink.add("Rodriges");
        myLink.add("Muslera");
        myLink.add("Gomis");
        myLink.add("Gomis");
        myLink.add("Gomis");

        myLink.remove("Gomis");

        for(int i=0; i< myLink.size(); i++){
            System.out.println(myLink.get(i));
        }
    }

 private static void arraylistbook() {
     List<String> readbook = new ArrayList<>();
     readbook.add("ince Mehmet");
     readbook.add(" Kurk mantolu madonna");
     readbook.add("okulsuz toplum");
     readbook.add("ince mehmet4");
     readbook.remove(3);


     System.out.println(readbook);

     for(int i=0;i<readbook.size();i++) {
         System.out.println(readbook.get(i));

     }
 }
}

