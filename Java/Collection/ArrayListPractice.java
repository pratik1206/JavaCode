package Collection;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);


        System.out.println(al);
        System.out.println("size of arrayList  = "+al.size());
        System.out.println(al.get(2));
        System.out.println("To check list empty or not   "+al.isEmpty());

//        System.out.println("copied list"+al1);
       System.out.println(al.clone());

//        System.out.println(al.set(1,"pratik"));
        System.out.println(al);
//        al.remove(0);
        System.out.println(al);

        for (int i=0;i<al.size();i++){
            System.out.println("this is looped arraylist"+al.get(i));
        }

        ArrayList al1 = new ArrayList();
        al1.add(50);
        al1.add(60);
        al1.addAll(al);
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println("sorted List = "+al1);
        Collections.reverse(al1);
        System.out.println("Reverse List = ]"+al1);
        System.out.println(al1.contains(1000));

        Collections.shuffle(al1);
        System.out.println("arraylist after shuffle"+al1);


        Collections.sort(al1);
        System.out.println(al1);
        Collections.swap(al1,2,5);
        System.out.println(al1);

       Object maxnum =  Collections.max(al1);
        System.out.println("maximum ele from list"+maxnum);


        System.out.println("-------------------------------------");

        List<Integer> num = new ArrayList<Integer>();
        num.add(23);
        num.add(3);
        num.add(65);
        num.add(17);
        num.add(7);
        num.add(23);
        num.add(3);
        num.add(11);
        System.out.println("list of prime numbers : " + num);
        Set<Integer> primesWithoutDuplicates  = new LinkedHashSet<Integer>(num);
        num.clear();
        num.addAll(primesWithoutDuplicates);

        System.out.println("List of Numbers Without Duplicates : " + num);
    }

}
